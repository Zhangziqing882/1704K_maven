<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<button onclick="href=/views/add.jsp">添加</button>
	<table>
		<tr>
			<td>Id</td>
			<td>姓名</td>
			<td>类型</td>
			<td>年龄</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="ani">
			<tr>
				<td>${ani.id}</td>
				<td>${ani.name}</td>
				<td>${ani.type}</td>
				<td>${ani.age}</td>
				<td>
					<a href="${pageContext.request.contextPath}/deleteAnimal?id=${ani.id}">删除</a>
					<a href="${pageContext.request.contextPath}/queryById?id=${ani.id}">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</center>

</body>
</html>