<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.dhananjay.*" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<body>
<h2>Hello World!</h2>



	<form action="fetchdata">
	
		<input type= "text" id="id" name="id" placeholder ="Enter your id">
		<input type= "submit">
	
	</form>
	
	
	
	<h1>New User</h1>
	
		<form action="saveuser" method="post">
		<input type="text" id="id" name="id" placeholder="Enter id"> <br> <br> 
			<input type="text" id="name" name="name" placeholder="Enter Name"> <br>	<br>	
		<input type="email" id="email" name= "email" placeholder="Enter Email Add"> <br> <br>		
		<input type="text" id="age" name ="age" placeholder="Enter Age"> <br>	<br>	
			<input type= "submit">
		</form>

	

</body>
</html>
