package com.ComplaintRedressalSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Complaint {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int uid;
	
	private String title;
	
	private String description;
	
	private String userfeedback;
	
	private int eid;
	
	private String status;

	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Complaint(int id, int uid, String title, String description, String userfeedback, int eid, String status) {
		super();
		this.id = id;
		this.uid = uid;
		this.title = title;
		this.description = description;
		this.userfeedback = userfeedback;
		this.eid = eid;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserfeedback() {
		return userfeedback;
	}

	public void setUserfeedback(String userfeedback) {
		this.userfeedback = userfeedback;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Complaint [id=" + id + ", uid=" + uid + ", title=" + title + ", description=" + description
				+ ", userfeedback=" + userfeedback + ", eid=" + eid + ", status=" + status + "]";
	}
	
}
