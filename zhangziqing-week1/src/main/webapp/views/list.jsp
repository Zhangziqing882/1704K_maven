<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	function fx(){
		$("[name=fx]").each(function(){
			this.checked=!this.checked
		})
	}
	function tj(){
		location.href="${pageContext.request.contextPath}/views/add.jsp";
	}
	function plsc(){
		var id="";
		$("[name=fx]:checked").each(function(){
			id+=","+$(this).val();
		})
		id=id.substring(1);
		alert(id)
		location.href="${pageContext.request.contextPath}/zw/deleteZw?id="+id;
	}

</script>
<title>列表展示</title>
</head>
<body>
<center>
	<button onclick="tj()">添加</button>
	<form action="${pageContext.request.contextPath}/zw/queryAll" method="post">
		<input type="text" value="${Zname}" name="name"><button>搜索</button>
	</form>
	<table>
		<tr>
			<td>
				<button onclick="fx()">全选/全不选</button>
			</td>
			<td>序号</td>
			<td>名称</td>
			<td>描述</td>
			<td>类别</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${zwList.list}" var="zw" varStatus="count">
			<tr>
				<td><input type="checkbox" value="${zw.id}" name="fx"></td>
				<td>${count.count}</td>
				<td>${zw.name}</td>
				<td>${zw.show}</td>
				<td>${zw.tname}</td>
				<td>
					<a href="${pageContext.request.contextPath}/zw/look?id=${zw.id}">查看</a>
					<a href="${pageContext.request.contextPath}/zw/queryById?id=${zw.id}">修改</a>
					<a href="${pageContext.request.contextPath}/zw/deleteZw?id=${zw.id}">删除</a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td>
				<button onclick="plsc()">批量删除</button>
			</td>
			<td colspan="5">
				<a href="${pageContext.request.contextPath}/zw/queryAll?pageNum=1&name=${Zname}">首页</a>
				<a href="${pageContext.request.contextPath}/zw/queryAll?pageNum=${zwList.prePage }&name=${Zname}">上一页</a>
				<a href="${pageContext.request.contextPath}/zw/queryAll?pageNum=${zwList.nextPage}&name=${Zname}">下一页</a>
				<a href="${pageContext.request.contextPath}/zw/queryAll?pageNum=${zwList.pages}&name=${Zname}">尾页</a>
				当前是第${pageNum}页，总共${zwList.pages}页
			</td>
		</tr>
	</table>
</center>
</body>
</html>