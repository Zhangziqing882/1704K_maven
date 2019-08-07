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
	<form action="${pageContext.request.contextPath}/updateAnimal" method="post">
	<input type="hidden" value="${animal.id}" name="id">
		姓名:<input type="text" name="name" value="${animal.name}"><br>
		种类:<input type="text" name="type" value="${animal.type}"><br>
		年龄:<input type="text" name="age" value="${animal.age }"><br>
		<button>提交</button>
	</form>
</center>
</body>
</html>