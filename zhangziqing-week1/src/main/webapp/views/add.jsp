<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加页面</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		var src = "${pageContext.request.contextPath}/zw/selectAll";
		$.post(src,function(arr){
			for (var i = 0; i < arr.length; i++) {
				$("[name=tid]").append("<option value="+arr[i].tid+">"+arr[i].tname+"</option>")
			}
		},"json")
	})
</script>
<body>
<center>
	<form action="${pageContext.request.contextPath}/zw/addZW" method="post">
		
			名称:<input type="text" name="name"><br>
			描述:<input type="text" name="show"><br>
			类别:<select name="tid"></select><br>
		<button>添加</button>
	</form>

</center>

</body>
</html>