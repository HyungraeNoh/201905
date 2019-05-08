<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.java0503.사용자"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!List<사용자> 사용자목록 = new ArrayList<사용자>();%>

	<%
	
		request.setCharacterEncoding("UTF-8");
		boolean check = true;
		if(request.getParameter("rename") != null){
			System.out.println(request.getParameter("rename"));
			for (int i = 0; i < 사용자목록.size(); i++) {
				if (사용자목록.get(i).get이름().equals(request.getParameter("rename"))) {
					response.getWriter().print("이름  : " + 사용자목록.get(i).get이름() + "<br>");
					response.getWriter().print("나이  : " + 사용자목록.get(i).get나이() + "<br>");
					response.getWriter().print("키   : " + 사용자목록.get(i).get키() + "<br>");
					response.getWriter().print("몸무게 : " + 사용자목록.get(i).get몸무게() + "<br>");
					check = false;
				}
			}
			if (check) {
				response.getWriter().print("검색한 이름은 사용자 목록에 없습니다.");
			}
		}else{
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			int tall = Integer.parseInt(request.getParameter("tall"));
			int weight = Integer.parseInt(request.getParameter("weight"));
			
			System.out.println(name + ""+ age + "" + tall + ""+ weight);
			사용자 신규 = new 사용자(name, age, tall, weight);
			사용자목록.add(신규);
			
			response.getWriter().print("성 공 : " + 사용자목록.size() + "<br>");
		}
	%>
</body>
</html>