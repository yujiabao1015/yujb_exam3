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
	<form action="selects" method="post">
	<input type="hidden" name="pageNum">
	<table class="table table-striped table-bordered">
		<tr>
			<td>
				姓名：<input type="text" name="name" value="${vo.name }">
				手机：<input type="text" name="phone" value="${vo.phone }">	
				房型：<input type="text" name="tname" value="${vo.tname }">	
			</td>
		</tr>
		<tr>
			<td>
				房价：<input type="text" name="p1" value="${vo.p1 }">至
				<input type="text" name="p2" value="${vo.p2 }">
				预定日期：<input type="text" name="t1" value="${vo.t1 }">至
				<input type="text" name="t2" value="${vo.t2 }">
				<input class="btn btn-primary" type="submit" value="查询">
				<input class="btn btn-primary" type="button" value="添加" onclick="add()">
			</td>
		</tr>
	</table>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th scope="col">预定日期</th>
					<th scope="col">姓名</th>
					<th scope="col">手机</th>
					<th scope="col">类型</th>
					<th scope="col">房价</th>
					<th scope="col">备注</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${info.list }" var="a">
					<tr>
						<td>${a.createDate }</td>
						<td>${a.name }</td>
						<td>${a.phone }</td>
						<td>${a.tname }</td>
						<td>${a.price }</td>
						<td>${a.massage }</td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="12">
						<jsp:include page="pages.jsp"></jsp:include>
					</td>
				</tr>
			</tfoot>
		</table>
	</form>
</body>
<script type="text/javascript">
	function goPage(pageNum){
		$('[name="pageNum"]').val(pageNum);
		$("form").submit();
	}
	function add(){
		location.href="add";
	}
	
</script>
</html>