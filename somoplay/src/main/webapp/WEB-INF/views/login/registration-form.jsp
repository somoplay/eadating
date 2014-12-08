<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
	<head><title>Registration From</title></head>
	<body>
			<form:form action="sendEmail" modelAttribute="UsersVerify">
			
				<div><h1>USER NAME</h1><form:input path="userName" /></div>
				<div><h1>EMAIL</h1><form:input path="email" /></div>				
				<div><h1>PASSWORD</h1><form:password path="passwordSalt" /></div>
				<div><input type="submit" value="Register" /></div>
			</form:form>
	</body>
</html>