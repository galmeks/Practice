<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Menu</title>
</head>
<body>
<form id=frmUpdate action="update" method=post>
메뉴명:<input type=text name=name value=${mdto.name }><br>
가격:<input type=number name=price value=${mdto.price }><br>
<input type=hidden name=seqno value=${mdto.seqno }>
<input type=submit value=수정>&nbsp;<input type=reset value=비우기>
</form>
</body>
</html>