<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>QUERY</title>
</head>
<style>

body{

}

h2 {text-align:center};

input {text-align:center};

#comment {

position:relative;
left:100px;
}

input[type="submit"] {

position:relative;
left:600px;
background-color:lightgreen;
border-radius:5px;
padding: 4px 8px;
font-family:georgia;
font-weight:bold;
cursor:pointer;

}

a {

	position:relative;
	left:520px;
	top:50px;
	background-color:pink;
	border-radius:5px;
	padding: 4px 8px;
	font-family:georgia;
	font-weight:bold;

}

</style>
<body background = "D:\Background Images/College Website/22.png" >

<h1 style = ' text-align:center;'>If you Have Any Query Mail Us on University E-Mail ID</h1><br><br>
<form method = "post" action = "Query">
<h2>University E-Mail -- University@gmail.com</h2><br><br>
<h2>You Can also Leave Your Questions or Queries in this Box</h2> 
<textarea style='position:relative; left:475px;' rows="10" cols="40" placeholder="Write Text Here!" >Write Text Here! </textarea><br><br>
<input type ="submit" value ="SUBMIT"> 
<a style = 'color:blue;' href = index.jsp>HOME</a>
</form>
</body>
</html>