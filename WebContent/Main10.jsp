<%@page import="com.java0508.Test1Interface"%>
<%@page import="com.java0508.Test"%>
<%@page import="com.java0508.TestInterface"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%
		TestInterface ti;
		//ti = new TestInterface(); //인터페이스는 생성자가 없다.
		ti = new Test();
		int result = ti.add(); // 돌아오는 값이 정수형이다.
		
		//ti.print(); // 인터페이스에 있지 않은 매소드이기 때문에 사용 불가
		Test1Interface t1i = new Test();
		t1i.add(10); 
%>
<%=result %>  <!-- 변수값 출력 -->