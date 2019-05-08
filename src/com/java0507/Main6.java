package com.java0507;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java0503.사용자;



@WebServlet("/Main6")
public class Main6 extends HttpServlet {
	
	List<사용자> 사용자목록 = new ArrayList<사용자>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//사용자 입력
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String name  = request.getParameter("name");
		int age =Integer.parseInt(request.getParameter("age"));
		int tall = Integer.parseInt(request.getParameter("tall"));
		int weight = Integer.parseInt(request.getParameter("weight"));
		사용자 신규 =  new 사용자(name,age,tall,weight);
		사용자목록.add(신규);
		response.getWriter().print("성 공 : " + 사용자목록.size());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//사용자 검색
		
		request.setCharacterEncoding("UTF-8"); //request값도 문자가깨지기 때문에 Encoding해줘야한다.
		
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		response.getWriter().print("사용자 정보 >  " + 사용자목록.size());
		
		//파라메터 확인
		Enumeration<String> params = request.getParameterNames();
		while (params.hasMoreElements()) {
			System.out.println(params.nextElement());
		}
		
		String name = request.getParameter("name");
		boolean check = true;
		for(int i = 0 ; i <사용자목록.size(); i++) {
			if(사용자목록.get(i).get이름().equals(name)) {
				response.getWriter().print("<br>이름  : " + 사용자목록.get(i).get이름());
				response.getWriter().print("<br>나이  : " +사용자목록.get(i).get나이());
				response.getWriter().print("<br>키   : " +사용자목록.get(i).get키());
				response.getWriter().print("<br>몸무게 : " +사용자목록.get(i).get몸무게());
				check = false;
			}
		}
		if(check) { //한번만 나타나게 해주기위해서 else를 쓰지 않고 밖으로 빼내서 따로 한번만 사용한다.
				response.getWriter().print("검색한 이름 : "+ name + "은 사용자 목록에 없습니다.");
		}
	}

}
