package com.java0503;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main4")
public class Main4 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String y = request.getParameter("x");
		String x = request.getParameter("y");

		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");

		구구단 문제 = new 구구단();
		String result = "";
//		result = 문제.lv1();
		result = 문제.lv2();

		response.getWriter().print(result);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
