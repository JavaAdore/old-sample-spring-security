
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<html>
<body>
	<h2>Hello World!</h2>
	
	<sec:authorize access="hasRole('ADMIN')">
		this content is displayed only for admin
	</sec:authorize>
	<br/>

	<a href="forAll.jsp"> for all users</a>
	<br />
	<a href="authenticated.jsp"> for authenticated users</a>
	<br />
	<a href="admin/Admin.jsp"> for Admin user only</a>
 	
	
	<sec:authorize access="isAuthenticated()">
		<a href="logout">logout</a>
	</sec:authorize>
	<br/>
	
 	



</body>
</html>
