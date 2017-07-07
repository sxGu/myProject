<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="gu/helloworld">hello world</a>
<p id="times"></p>
</body>


<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js">
</script>


<script type="text/javascript">
function getTime()
{
    var time = new Date();
	/* console.log(time.toLocaleString()); */
    $("#times").html(time.toLocaleString());
}

$(document).ready(function(){
	 setInterval("getTime()",1000);
}); 
</script>



</html>

