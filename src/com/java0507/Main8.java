package com.java0507;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main8")
public class Main8 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String html = "";
		
		html +="<!DOCTYPE html>";
		html +="<html>";
		html +="<head>";
		html +="<meta charset='UTF-8'>";
		html +="<title>Insert title here</title>";
		html +="</head>";
		html +="<body>";
		for(int i =0; i < 10; i++) {
			html +="		안녕하세요.";
		}
		html +="</body>";
		html +="</html>";
		
		System.out.println(html);
		response.getWriter().print(html);
		
	}
}
