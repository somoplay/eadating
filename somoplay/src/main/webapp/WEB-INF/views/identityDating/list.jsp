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

<P>Id:${ele.id} || Name:${ele.displayName} || Signature:${ele.signature} || location: ${ele.location} ||  introduction: ${ele.introduction} || perfect_match:${ele.perfectMatch} || ideal_date:${ele.idealDate} 


<c:if test="${empty ele.images}"><br/>No Images</c:if>


<c:if test="${!empty ele.images}">

<br/>-----Images-----

<c:forEach var="image" items="${ele.images}">

<br/>>>>>>${image.name}

</c:forEach>

</c:if>



</P>

</c:forEach>

</body>

</html>

