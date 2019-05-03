package com.java0503;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;


@WebServlet("/Main5")
public class Main5 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*		사용자 유저 = new 사용자();
		유저.나이 = 1;
		유저.키 = 2;
		유저.몸무게 = 1000;
		유저.이름 = "구디";
		
		유저.set이름("구디");
		String 이름 = 유저.get이름();
		System.out.println(이름); */
		
/*		사용자 구디 = new 사용자("구디",1,2,1000); //한번에 데이터 베이스를 저정할수 있다.
		사용자 가산 = new 사용자("가산",16,183,50);  //담을 수 있는 정보를 서로 다르게 저장한다.
		
		if(구디.get나이() > 가산.get나이()) { // 구디가 클때
			System.out.println("구디");
		}
		else { //같거나 가산이 클때
			System.out.println("가산"); 
		}*/
		
		
		
		
/*		//HashMap은 유동적으로 자료를 넣어줄수있다.
		//배열과 비슷하지만 순서가 없다(index가 없다).
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("이름", "구디");
		resultMap.put("나이", 1);
		resultMap.put("키", 2);
		resultMap.put("몸무게", 1000);
		resultMap.put("학교", "구디아카데미");
		
		String 이름 = resultMap.get("이름").toString(); //형변화 Object > String
		System.out.println(이름); */
		
		
		
		List<사용자> 사용자목록 = new ArrayList<사용자>(); //배열
		사용자목록.add(new 사용자("구디",1,2,1000)); //0인덱스 위치에 사용자 객체 담기
		사용자목록.add(new 사용자("가산",16,183,50)); //1인덱스 위치에 사용자 객체 담기
		
/*		if(사용자목록.get(0).get나이() > 사용자목록.get(1).get나이()) {
			System.out.println(사용자목록.get(0).get이름());
		}
		else {
			System.out.println(사용자목록.get(1).get이름());
		} */
		
		
		
		사용자 구디 = 사용자목록.get(0);
		사용자 가산 = 사용자목록.get(1);
		
		if(구디.get나이() > 가산.get나이()) {
			System.out.println("구디");
		}
		else {
			System.out.println("가산");
		}
		
		List 정수형리스트 = new ArrayList(); //정해저있는 자료형이 아니라 자유롭게 넣을 수 있다.
		정수형리스트.add(1);
		정수형리스트.add("2");
		정수형리스트.add(3.4);
		정수형리스트.add(true);
		for(int i = 0; i < 정수형리스트.size(); i++) {
			System.out.println(정수형리스트.get(i));
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
