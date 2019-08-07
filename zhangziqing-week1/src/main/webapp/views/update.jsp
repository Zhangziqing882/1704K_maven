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
		var tt=$("[name=tt]").val();
		alert(tt)
		$.post(src,function(arr){
			for (var i = 0; i < arr.length; i++) {
				$("[name=tid]").append("<option value="+arr[i].tid+">"+arr[i].tname+"</option>")
				if(arr[i].tid==tt){
					$("[name=tid]").append("<option value="+arr[i].tid+" selected="selected">"+arr[i].tname+"</option>")
				}
			}
		},"json")
	})
</script>
<body>
<center>
	<form action="${pageContext.request.contextPath}/zw/update" method="post">
		<input type="hidden" name="tt" value="${zw.tid}">
		<input type="hidden" name="id" value="${zw.id}">
			名称:<input type="text" name="name" value="${zw.name}"><br>
			描述:<input type="text" name="show" value="${zw.show}"><br>
			类别:<select name="tid">
			</select><br>
		<button>修改</button>
	</form>

</center>

</body>
</html>