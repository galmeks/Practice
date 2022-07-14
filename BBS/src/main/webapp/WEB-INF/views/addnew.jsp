<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴 추가</title>
</head>
<style>
td{border:1px solid blue;}
</style>
<body>
<form id="frmAddnew" method="post" action="addMenu">
<input type='text' name='mname' id=mname><br>
<input type='number' name='price' id=price><br>
<input type='submit' value='추가'>&nbsp;<input type='reset' value='비우기'>
</form>
<br>
<table style='border-collapse:collapse'>
	<c:forEach var="a" items="${ml}">
		<tr><td><a href="delete/${a.seqno}" id=del>${a.seqno}</a></td>
		<td>${a.name}</td><td>${a.price}</td><td><a href='view?seqno=${a.seqno}' id="view">수정</a></td></tr>
	</c:forEach>
</table>
</body>
<script src="http://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.on('click','#del',function(){
	if(!confirm('정말로 삭제하시겠습니까?'))return false;
	return true;
})
</script>
</html>