<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h1>${title}</h1>
	<c:if test="${accountStatus eq 'list'}">
		<h3>list</h3>
	</c:if>
	<c:if test="${accountStatus eq 'add'}">
		<h3>add</h3>
	</c:if>
</body>
</html>