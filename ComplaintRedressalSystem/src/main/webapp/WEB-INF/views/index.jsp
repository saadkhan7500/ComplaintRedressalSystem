<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link href="<c:url value="/css/navi.css" />" rel="stylesheet">
    <link href="<c:url value="/css/index.css" />" rel="stylesheet">
    <link href="<c:url value="/css/tesseract.css" />" rel="stylesheet">
</head>
<style>
p.a {
  font: 80px arial, sans-serif;
  font-weight: bold;
  text-align:center;
  color:#FE9800;
}
p.b {
  font: 80px arial, sans-serif;
  font-weight: bold;
  text-align:center;
}
</style>
<body style="background-color:#252636 ;color:white;">
<div class="navbar">
  <a  class="active" href="index.html"><i class="fa fa-fw fa-home"></i> Home</a> 
  <a href="#"><i class="fa fa-fw fa-envelope"></i> Contact</a> 
  <a  href="userlogin" style="float: right;"><i class="fa fa-fw fa-user"></i>User Login</a>
  <a  href="managerlogin" style="float: right;"><i class="fa fa-fw fa-user"></i>Manager Login</a>
  <a  href="engineerlogin" style="float: right;"><i class="fa fa-fw fa-user"></i>Engineer Login</a>
  <a  href="adminlogin" style="float: right;"><i class="fa fa-fw fa-user"></i>Admin Login</a>
</div>

<div class="block">
    <div class="shape">
      <div class="cube outer">
        <div class="side left"></div>
        <div class="side right"></div>
        <div class="side top"></div>
        <div class="side bottom"></div>
        <div class="side front"></div>
        <div class="side back"></div>
        
        
        <div class="cube">
          <div class="side left"></div>
          <div class="side right"></div>
          <div class="side top"></div>
          <div class="side bottom"></div>
          <div class="side front"></div>
          <div class="side back"></div>
        </div>
        
      </div>
    </div>
</div>

<p class="a">Complaint Registration Portal</p>
<p class="b">Complaint Box</p>
</body>
</html>
