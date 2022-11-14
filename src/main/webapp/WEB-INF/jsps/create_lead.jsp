<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>create page</h2>
	<form action="save" method="post">
	<pre>	
	
	First Name<input type="text" name="firstname"/>
	last Name<input type="text" name="lastname"/>
	email<input type="text" name="email"/>
	mobile<input type="text" name="mobile"/>
	
	
	<input type="submit" value="save"/>	
			
			
	</pre>



</form>
${msg}

</body>
</html>	