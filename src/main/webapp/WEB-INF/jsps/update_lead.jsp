<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
	<h2>create new lead</h2>
	<form action="updateonelead" method="post">
	<pre>	
	<input type="hidden" name="id" value="${lead.id}"/>
	First Name<input type="text" name="firstname" value ="${lead.firstname}"/>
	last Name<input type="text" name="lastname" value ="${lead.lastname}"/>
	email<input type="text" name="email" value ="${lead.email}"/>
	mobile<input type="text" name="mobile" value ="${lead.mobile}"/>
	
	
	<input type="submit" value="update"/>	
			
			
	</pre>

</form>


</body>
</html>