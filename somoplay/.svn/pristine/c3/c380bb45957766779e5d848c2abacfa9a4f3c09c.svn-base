<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="resetverify" method="post">  
	 <table width="207" border="0" align="center">  
	        <tr>  
	          <td colspan="2" align="center">Password Reset</td>  
	        </tr>  
	        <tr>  
	          <td width="68" >Email</td>  
	          <td width="127" ><label>  
	            <input name="email" type="text" id="email" size="20" />  
	          </label></td>  
	        </tr>
	        <tr><td>Verification Code</td><td><input id="index_code" name="codep" type="text" /></td>  
	       <td> <img id="imgObj" alt="Verification Code" src="code.html" />  
	        <a href="#" onclick="changeImg()">Change</a></td></tr>  
	        <tr>  
	          <td colspan="2" align="center"><label>  
	            <input type="submit"  value="submit" />  
	            <input type="reset"  value="reset" />  
	          </label></td>  
	        </tr>  
	  </table>  
	</form>  


	<script type="text/javascript">  
	    function changeImg() {  
	        var imgSrc = $("#imgObj");  
	        var src = imgSrc.attr("src");  
	        imgSrc.attr("src", chgUrl(src));  
	    }  
	    //时间戳     
	    //为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳     
	    function chgUrl(url) {  
	        var timestamp = (new Date()).valueOf();  
	        url = url.substring(0, 17);  
	        if ((url.indexOf("&") >= 0)) {  
	            url = url + "×tamp=" + timestamp;  
	        } else {  
	            url = url + "?timestamp=" + timestamp;  
	        }  
	        return url;  
	    }  
	</script> 	
<script type="text/javascript" src="js/jquery-easyui-1.3.1/jquery-1.8.0.min.js"></script>  	
</body>
</html>