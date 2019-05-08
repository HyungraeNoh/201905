<%@page import="com.java0508.Test"%>
<%@page import="com.java0508.TestInterface"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%
		TestInterface ti;
		//ti = new TestInterface(); //인터페이스는 생성자가 없다.
		ti = new Test();
		int result = ti.add(); // 돌아오는 값이 정수형이다.
%>
<%=result %>  <!-- 변수값 출력 -->