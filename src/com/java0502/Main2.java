package com.java0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main2")
public class Main2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		// url : http://localhost:8080/201905/Main2?a=1&b=2 커리스트링
		
		String a = request.getParameter("a"); // a 변수 : a = 1;
		String b = request.getParameter("b"); // b 변수 : b = 2;
		String cc = request.getParameter("c");
		
		System.out.println(cc);
		
		String c = a+b; // 12
		System.out.println(c);
		
		int d = Integer.parseInt(a) + Integer.parseInt(b);  // 12(문자열) -> 3(정수) 형변환
		System.out.println(d);
		
		response.getWriter().print(c + ", " + d);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		doGet(request, response);
	}

}
