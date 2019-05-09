<%@page import="com.java0508.Utill"%>
<%@page import="com.java0508.Main11Interface"%>
<%@page import="com.java0508.Student"%>
<%@page import="com.java0508.Main11"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<b> 학생 목록 관리 </b>
<%
	
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	String name2 = request.getParameter("name2");
	
	String name3 = request.getParameter("name3");
	String gender3 = request.getParameter("gender3");
	String id3 = request.getParameter("id3");
	String pw3 = request.getParameter("pw3");
	
	String name4 = request.getParameter("name4");

	Main11Interface M11 = new Main11();

	if (name != null) {
			M11.학생추가(new Student(name, gender, id, pw));
	} 
	else if (name2 != null) {
		
		if (M11.학생검색(name2) != null) {
			
			response.getWriter().print(M11.학생검색(name2).toString());
			
		}
	} 
	else if (name3 != null) {
			M11.학생수정(new Student(name3, gender3, id3, pw3));
			response.getWriter().println("수정되었습니다.");
	}
	else if (name4 != null){
		M11.학생삭제(new Student(name4, gender, id, pw));
		response.getWriter().println("삭제되었습니다.");
	}
%>