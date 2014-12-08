<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
	<head><title>Login From</title></head>
	<body>
			<form:form action="verifyInfo" modelAttribute="User">
			
				<div><h1>USER NAME / EMAIL</h1><form:input path="email" /></div>
				<div><h1>PASSWORD</h1><form:password path="passwordSalt" /></div>
				<div><input type="submit" value="Login" /></div>
			</form:form>
			
            <a href="prereset" id="forget">Forget Password</a>

			
	</body>
</html>