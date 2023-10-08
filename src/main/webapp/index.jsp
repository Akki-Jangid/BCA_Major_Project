<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change the link color to #111 (black) on hover */
li a:hover {
  background-color: #111;
}
</style>

<body background = "D:\Back_1.jpg" style = 'background-size:1000px;'>

<h1 style = text-align:center >|| University ||</h1> <hr>

<ul>
<li><a  href = "login.jsp"> LOGIN </a></li>
<li><a  href = "query.jsp"> FOR QUERIES</a></li>
<li><a  href = " courses.jsp">COURSES</a></li>
<li><a  href = "Gallery.jsp"> GALLERY </a></li>
<li><a  href = " admission.jsp">ADMISSION FORM</a></li>
<li><a  href = " logout">LOGOUT</a></li>
</ul>


<marquee direction = left style = color:green ><h2>---- For Any Query Direct Contact us ---- </h2></marquee>

</body>
</html>