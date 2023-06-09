<!DOCTYPE html>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<html>
<head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
		<link rel="stylesheet" href="css/index.css">
                <link rel="stylesheet" href="css/slider.css">
</head>
<style>


.navbar {
  width: 100%;
  background-color: #313348;
  overflow: auto;
}

.navbar a {
  float: left;
  padding: 12px;
  color: white;
  text-decoration: none;
  font-size: 17px;
}

.navbar a:hover {
  background-color:#FE9800;
}

.active {
  background-color: #FE9800;
}

@media screen and (max-width: 500px) {
  .navbar a {
    float: none;
    display: block;
  }
}
</style>
<body>
<div class="navbar">
  <a  href="#"><i class="fa fa-fw fa-home"></i> Home</a> 
  <a href="#"><i class="fa fa-fw fa-envelope"></i> Contact</a> 
  <a class="active" href="#"><i class="fa fa-fw fa-user"></i>Profile</a>
  <a href="index" style="float: right;"><i class="fa fa-sign-out"></i>Logout</a>
</div>

<%
  String id=request.getParameter("id");
  System.out.println(id);
%>

<div class="card" style="margin-top:20px;">
	<center><h2><b>Register Complaint</b></h2></center>
	<form action="addComplaint" method="post" class="w3-container"> 
	        User ID<input class="w3-input" type="text" name="uid" value="<%=id %>" readonly="readonly"><br/>       
            Title<input class="w3-input" type="text" name="title" required><br/> 
            Description
            <textarea id="subject" name="description" placeholder="Write something.." style="height:200px; width:100%;resize: vertical;" required></textarea>
            <input type="submit" class="button" value="Submit Complaint"/>   
    </form>
 </div>
</body>
</html>
