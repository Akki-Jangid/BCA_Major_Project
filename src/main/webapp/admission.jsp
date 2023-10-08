<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

label {
	font-weight:bold;
	font-size:20px;
}


input[type="text"], select {
	width:100%;
	padding:12px 20px;
	margin:10px 0;
	display:inline-block;
	border:1px solid #ccc;
	border-radius: 4px;
 	box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  font-weight:bolder;
  font-size:20px;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: gray;
  padding: 20px;
}

body {
	background-size:100% 100%;
	opacity:0.8;
	}
</style>
<body background="D:\Background Images\College Website/FIMT.jpg">

<h1 style = 'text-align:center; font-size:bold'><i> ADMISSION FORM </i></h1>
<div>
<form method="post" action="Admission">
	<label for="fname">First Name</label>
	<input type="text" id="fname" name="fname" placeholder="Your Name.."> 
	<label for="lname">Last Name</label>
	<input type="text" id="lname" name="lastname" placeholder="Your Last Name.."> 
	<label for="Gender">Gender</label>
	<select id="gender" name="gender">
	 	<option value="male">Male</option>
	 	<option value="female">Female</option>
	 	<option value="other">Other</option>
	</select>
	<label for="fathername">Father's Name</label>
	<input type="text" id="fathername" name="fathername" placeholder="Your Father's Name.."> 
	<label for="mothername">Mother's Name</label>
	<input type="text" id="mothername" name="mothername" placeholder="Your Mother's Name.."> 
	<label for="course">Course</label>
	<input type="text" id="course" name="cour" placeholder="Your Course.."> 
	<label for="education">Education Qualification</label>
	<input type="text" id="education" name="edu" placeholder="Your Education Qualification.."> 
	<label for="address">Address</label>
	<input type="text" id="address" name="add" placeholder="Your Home Address.."> 
	<label for="mobile">Mobile No.</label>
	<input type="text" id="mobile" name="mob" placeholder="Your Mobile No. .."> 
	<label for="caste">Caste <sub>( Submit Caste Certificate if Applicable )</sub></label>
	<!--   General <input type="checkbox" id="caste" name="caste" value="general"> OBC <input type="checkbox" id="caste" name="caste" value="obc"> SC <input type="checkbox" id="caste" name="caste" value="sc"> ST <input type="checkbox" id="caste" name="caste" value="st">
	-->
	<select id="caste" name="caste">
		<option value="general">General</option>
		<option value="obc">OBC</option>
		<option value="sc">SC</option>
		<option value="st">ST</option>
	</select>
	<input type="submit" value="Submit">
</form>
</div>
</body>
</html>