<%@ page import =  "java.io.PrintWriter" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		// 자바 영역
		PrintWriter pw = response.getWriter();
		pw.println(request.getPathInfo());
		pw.println(request.getProtocol());
		pw.println(request.getContextPath());
		pw.println(request.getLocalPort());
		pw.println(request.getServerPort());
		pw.println(request.getServletPath());
		pw.println(request.getContentType());
		pw.println(request.getQueryString());
		pw.println(request.getRemotePort());

%>
</body>
</html>