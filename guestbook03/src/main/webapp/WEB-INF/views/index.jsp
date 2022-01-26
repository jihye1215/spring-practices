<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>

	<form action="${pageContext.request.contextPath }/add" method="post">
		<table border=1 width=500>
			<tr>
				<td>이름</td><td><input type="text" name="name"></td>
				<td>비밀번호</td><td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan=4><textarea name="message" cols=60 rows=5></textarea></td>
			</tr>
			<tr>
				<td colspan=4 align=right><input type="submit" value="등록"></td>
			</tr>
		</table>
	</form>
	<br>
	<c:forEach items = "${list }" var = "vo">
	<table width=510 border=1>
		<tr>
			<td>${vo.getNo() }</td>  
			<td>${vo.getName()}</td>
			<td>${vo.getReg_date()}</td>
		</tr>
		<tr>
			<td colspan = 4>${vo.getMessage()}</td>
		</tr>
		<td><a href="${pageContext.request.contextPath}/guestbook/deleteform/${vo.getNo()}">삭제</a></td>
	</table>
	</c:forEach>
</body>
</html>