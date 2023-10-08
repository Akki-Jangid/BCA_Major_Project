<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>

h1 {
	font-family:georgia;
	text-align:center;
}

#home {
	background-color:pink;
	border:2px solid black;
	font-weight:bold;
	font-size:20px;
	color:black;
	padding: 8px 15px;
	border-radius:4px;
	position:relative;
	left:590px;
	top:20px;
}

a{
text-decoration:none;
}

a:link {
color:blue;
}

a:visited {
color:darkpink;
}
a:acive{
color:red;
}
a:hover{
color:red;
font-family:monospace;
}

div {
	
	font-family:Times New Roman;
	font-style:oblique;
	font-size:30px;
	text-align:center;

}
body {
	background-size:100% ;
	
}

</style>


<body background="D:\Background Images/College Website/1.jpg" >
<form action = "post">
<h1>COURSES</h1><br><br>
<div><a href = BCA> BCA (Bachelor in Computer Applications) </a><br><br>
<a href = MCA> MCA (Master in Computer Applications) </a><br><br>
<a href = BBA> BBA (Bachelor in Business Administration) </a><br><br>
<a href = MBA> MBA (Master in Business Administration) </a><br><br>
<a href = BA> BA (Bachelor of Arts) </a><br><br>
<a href = MA> MA (Master of Arts) </a></div><br>
<a id="home"  href = index.jsp>HOME</a>
</form>
</body>
</html>