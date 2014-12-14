<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>List_merge</title>
</head>
<body>
<h1>
	list entries 
</h1>
<c:if test="${empty entries}">No Data</c:if>
<c:forEach var="ele" items="${entries}"> 
	<P>Id:${ele.id} || Name:${ele.nameEn} || Average Price:${ele.averagePrice} || Address: ${ele.address} ||  City: ${ele.city} || Email:${ele.email} || Website:${ele.website} 
		<c:if test="${empty ele.images}"><br/>No Images</c:if>
		<c:if test="${!empty ele.images}">
			<br/>-----Images-----
			<c:forEach var="image" items="${ele.images}">
				<br/>>>>>>${image.name}
			</c:forEach>
		</c:if>
		<c:if test="${empty ele.storehours}"><br/>No Business Hours</c:if>
		<c:if test="${!empty ele.storehours}">
			<br/>-----Business Hour-----
			<c:forEach var="hours" items="${ele.storehours}">
				<br/>>>>>>Day ${hours.weekday}: ${hours.startHour}AM - ${hours.endHour}PM
			</c:forEach>
		</c:if>
	</P>
</c:forEach>
</body>
</html>
