<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<%@ include file="./include/header.jsp" %>
</head>
<body>
	<%@ include file="./include/navigation.jsp" %>
<h1>
	User Data  
</h1>

<p>
usrID: ${user.userID}<br /> 
name: ${user.firstName} ${user.lastName}<br />
email: ${user.userEmail}<br />
register date: <fmt:formatDate value="${user.createDate}" pattern="yyyy-MM-dd-HH:mm:ss"/>
</p>

</body>
</html>
