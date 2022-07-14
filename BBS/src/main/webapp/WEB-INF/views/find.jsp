<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Menu</title>
</head>
<style>
td{border:1px solid blue;}
</style>
<body>
<h1>
사원정보
</h1>
사번:${mi.m.employee_id}<br>
<%-- 이름:${m.emp_name}<br> --%>
<%-- 월급:${m.salary}<br> --%>
<%-- 매니저사번:${m.manager_id}<br> --%>
<%-- 매니저이름:${m.manager_name}<br> --%>
<%-- 입사일자:${m.hire_date}<br> --%>
<%-- 이메일:${m.email}<br> --%>
<%-- 팀원숫자:${n}<br> --%>
<!-- <table style='border-collapse:collapse'> -->
<%-- 	<c:forEach var="empDTO" items="${mDTO}"> --%>
<%-- 		<tr><td>${empDTO.employee_id}</td><td>${empDTO.emp_name}</td> --%>
<%-- 		<td>${empDTO.salary}</td><td>${empDTO.manager_id}</td></tr> --%>
<%-- 	</c:forEach> --%>
<!-- </table> -->
</body>
</html>