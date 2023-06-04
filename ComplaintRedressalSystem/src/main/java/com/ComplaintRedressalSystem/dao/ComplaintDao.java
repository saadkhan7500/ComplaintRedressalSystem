package com.ComplaintRedressalSystem.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;


import com.ComplaintRedressalSystem.model.Complaint;
import com.ComplaintRedressalSystem.model.Engineer;

@Repository
public class ComplaintDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int addComplaint(Complaint complaint) {
		return (Integer) hibernateTemplate.save(complaint);
	}

	public List<Complaint> allComplaints() {
		return this.hibernateTemplate.loadAll(Complaint.class);
	}
	
	public List<Complaint> getComplaintsByUid(int uid) {
		String hql = "FROM Complaint c WHERE c.uid = :uid";
	    Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
	    Query<Complaint> query = session.createQuery(hql, Complaint.class);
	    query.setParameter("uid", uid);
	    return query.getResultList();
	}
	
	@Transactional
	public void editComplaint(int uid, int eid) {
		
		List<Complaint> complaints = getComplaintsByUid(uid);
		System.out.println(complaints);
		for(Complaint complaint : complaints)
		{
			complaint.setStatus("assigned");
			complaint.setEid(eid);
			hibernateTemplate.update(complaint);
		}

	}

	public List<Complaint> getComplaintsByEid(int eid) {
		String hql = "FROM Complaint c WHERE c.eid = :eid";
	    Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
	    Query<Complaint> query = session.createQuery(hql, Complaint.class);
	    query.setParameter("eid", eid);
	    return query.getResultList();
	}
	
	@Transactional
	public List<Complaint> assignedComplaint(int eid) {

		List<Complaint> complaints = getComplaintsByEid(eid);
		return complaints;
	}
}
