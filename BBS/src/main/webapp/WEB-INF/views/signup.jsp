<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
#list td{border:1px solid blue;}
#attr td{text-align:center;}
</style>
<body>
<form id="frmAdd" action="addmember" method=post>
<table>
<tr><td>유저아이디:</td><td><input type=text name=uid></td></tr>
<tr><td>비밀번호:</td><td><input type=password name=pwd id=pwd></td></tr>
<tr><td>비밀번호확인:</td><td><input type=password name=pwd1 id=pwd1></td></tr>
<tr><td>이름:</td><td><input type=text name=uname></td></tr>
<tr><td>전화번호:</td><td><input type=number name=mobile></td></tr>
<tr><td colspan=2 style='text-align:center;'><input type=submit value="추가">&nbsp;<input type=reset value=비우기></td></tr>
</table>
</form>
<table id="list" style='border-collapse:collapse;' width="450px">
<tr id="attr"><td>User ID</td><td>비밀번호</td><td>이름</td><td>모바일</td><td>가입일</td></tr>
<c:forEach var="a" items="${list}">
<tr><td>${a.id }</td><td>${a.pwd }</td><td>${a.name }</td><td>${a.mobile }</td><td>${a.joindate}</td></tr>
</c:forEach>
</table>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.on('submit','#frmAdd',function(){
	if($('#pwd').val()!=$('#pwd1').val()){
		alert('비밀번호를 확인해주세요.')
		return false;
	}
	return true;
})
</script>
</html>