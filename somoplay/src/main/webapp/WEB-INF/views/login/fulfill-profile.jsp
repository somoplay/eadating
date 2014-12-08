<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
			<form:form action="fulfill" modelAttribute="User">
			
				<div><h5>USER NAME</h5><form:input path="userName" /></div>
				<div><h5>EMAIL</h5><form:input path="email" /></div>
				<div><h5>GENDER</h5><form:input path="gender" /></div>
				<div><h5>BIRTHDAY</h5><form:input path="birthday" /></div>
				<div><h5>FIRST NAME</h5><form:input path="firstName" /></div>
				<div><h5>LAST NAME</h5><form:input path="lastName" /></div>
				<div><h5>REFERRAL NO</h5><form:input path="referralNumber" /></div>
				<div><h5>PHONE NO</h5><form:input path="phoneNumber" /></div>
				<div><input type="submit" value="Register" /></div>
			</form:form>
</body>
</html>