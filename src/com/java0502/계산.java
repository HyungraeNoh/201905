package com.java0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/계산")
public class 계산 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");

		계산기 cal = new 계산기();
		
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(c);
		int z = 0;
		String html = "";
		
		switch (b) {
		case "+":
			z = cal.덧셈(x, y);
			
			break;
		case "-":
			z = cal.뺄셈(x, y);
			break;
		case "*":
			z = (int)cal.곱셈(x, y);
			break;
		case "/":
			z = (int)cal.나눗셈(x, y);
			break;
		default:
			html = html + "<a href='http://localhost:8080/201905/'>처음으로</a>";
			break;
		}
		
		response.getWriter().print(a+b+c +" = "+ z);
		html = html + "<a href='http://localhost:8080/201905/'>처음으로</a>";
		response.getWriter().print(html);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
	}

}
