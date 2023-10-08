<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

input[type="text"] {

	padding: 7px 10px;
	border-color:pink;
}

#name_1 {
	height:30px;
	width:300px;
	border-radius:10px;
	border-color:pink;
	
	}
	
#pass {
	height:30px;
	width:300px;
	border-radius:10px;
	border-color:pink;
	}
	
#pos {
	position:relative;
	left:300px;
	top:100px;
	}
	
#login {
	background-color:lightgray;
	height:30px;
	font-size:15px;
	font-weight:bold;
	border-radius:5px;
	position:relative;
	left:210px;
	top:100px;
	cursor: pointer;
	}
	
#reset {
	background-color:lightgray;
	height:30px;
	font-family:georgia;
	font-size:15px;
	font-weight:bold;
	border-radius:5px;
	position:relative;
	left:210px;
	top:100px;
	cursor: pointer;
	}

body{
	font-size:bold; 
	text-align:center; 
	background-size:100% 100%;
	background-attachment: fixed;

}

#Whole {
position:relative;
bottom:30px;
}

</style>

<body background="D:\Background Images\College Website\17.jpg">
<div id="Whole"><h1 style = 'text-align:center; position:relative; left:185px; top:100px; font-family:georgia;'> Login</h1>
 <form action="LoginPage" method="post">
 <div id="pos">
<input id="name_1" type="text" name="e1" placeholder="E-Mail"  > <br><br>
<input id="pass" type="text" name="p1" placeholder="Password" > <br><br>
<a style = 'color:blue; position:relative; left:100px; bottom:10px;' href = Register.jsp> Register Here!</a>
</div>
<input id="login" type="submit" Value="Login" >
<input id="reset" type="reset" value="Reset" > 
</form> 
</div>

</body>
</html>