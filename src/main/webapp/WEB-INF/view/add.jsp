<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
</head>

<body>
	<form action="add" method="post">
		预定日期：<input type="date" name="createDate"><br>
		姓名：<input type="text" name="createDate"><br>
		手机：<input type="text" name="createDate"><br>
		房型：<select id="sel" name="tid">
			<option value="-1">请选择</option>
		</select><br>
		价格：<input type="text" name="createDate"><br>
		备注：<input type="text" name="createDate"><br>
		<input type="submit" value="提交">
	</form>
</body>
<script type="text/javascript">
	$(function(){
		$.ajax({
			url:"getType",
			type:"post",
			dataType:"json",
			success:function(result){
				for(var i in result){
					$("#sel").append("<option value='"+result[i].tid+"'>"+result[i].tname+"</option>");
				}
				
			}
		
		})
		
	})
	
</script>
</html>