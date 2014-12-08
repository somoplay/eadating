<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>      
<html>
<head>
<title>Search Store_merge</title>
</head>
<body>
	<form method="post">
		Search by  
		<select name="searchtype">
			<option value="id">Id</option>
			<option value="keyword">Keyword</option>
			<option value="type">Type</option>
			<option value="averageprice">Average Price</option>
			<option value="distance">Distance</option>
			<!-- <option value="image">Store Id for Images</option> -->
		</select>
		<br/>Content:<input type="text" name="content"/><br/>
		<input type="submit" value="Search"/>
	</form>
</body>
</html>