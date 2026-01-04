<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Trang Chủ</title>
</head>
<body>
    <h2>Chào mừng, ${sessionScope.account.fullName}!</h2>
    <a href="${pageContext.request.contextPath}/logout">Đăng xuất</a>
</body>
</html>
