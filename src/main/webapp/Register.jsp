<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- 
     -->
<%@ page import = "java.sql.*" %>    
<%@ page import = "javax.servlet.*" %>    
<%@ page import = "javax.servlet.http.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

.in {
 width:400px;
 padding:10px 8px;
 border-radius:5px;
 border-color:gray;
 margin:auto;
}

form {
	position:relative;
	left:450px;
	
}

div{
}

body {
background-size:100% 150%;
opacity:0.9;
}

label {
font-weight:bold;
font-size:20px;

}

input[type=submit] {
	margin:3px;
	padding:7px;
	font-weight:bold;
	font-size:15px;
	font-family:georgia;
	width:100px;
	border-radius:5px;
	background-color:lightgreen;
	cursor: pointer;
}

input[type=reset] {
	margin:3px;
	padding:7px;
	font-weight:bold;
	font-size:15px;
	font-family:georgia;
	width:100px;
	border-radius:5px;
	background-color:skyblue;
	cursor: pointer;	
}

</style>
<body background="D:\Background Images\College Website/18.png" >

<h1 style = 'text-align:center; font-family:georgia; '>REGISTRATION </h1><br><br>
<form method = "post" action = "Register"  >	
<div>
	<label>Name</label><br><input class="in" type = "text" name = "t1" placeholder = "Enter Your Name" ><br><br>
	<label>Password </label><br><input class="in" type = "password"  name = "p1" placeholder = "Enter Password"><br><br>
	<label>Mobile </label><br><input class="in" type = "number" name = "n1" placeholder = "Mobile Number"> <br><br>
	<label>E-Mail </label><br><input class="in" type = "text"  name = "e1" placeholder = "Enter Your E-Mail ID"><br><br>
	<input  type = "submit" value = "Submit"> 
	<input  type = "reset" value = "Reset" >
</div>	
</form>
	

</body>
</html>