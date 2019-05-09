package com.java0508;

import java.util.ArrayList;
import java.util.List;
import com.java0508.Utill;

public class Main11 implements Main11Interface {
	
	@Override
	public boolean 학생추가(Student stu) {
		
		boolean check = true;
		String name = stu.getName();
		String gender = stu.getGender();
		String id = stu.getId();
		String pw = stu.getPw();
		
		Student 신규 = new Student(name, gender, id, pw);
		Utill.학생목록.add(신규);
		
		if(stu != null) {
			System.out.println(name+"님이 등록되었습니다.");
			check = false;
		}
		
		for (int i = 0; i < Utill.학생목록.size(); i++) {
			if (Utill.학생목록.get(i).getName().equals(name)) {
				System.out.println("이름  : " + Utill.학생목록.get(i).getName() );
				System.out.println("성별  : " + Utill.학생목록.get(i).getGender() );
				System.out.println("ID    : " + Utill.학생목록.get(i).getId() );
				System.out.println("PW  : " + Utill.학생목록.get(i).getPw() );
				check = false;
			}
		}
		if (check) {
			System.out.println("검색한 이름은 사용자 목록에 없습니다.");
		}
		
		return check;
	}

	@Override
	public Student 학생검색(String name) {
		
		for (int i = 0; i < Utill.학생목록.size(); i++) {
			if (Utill.학생목록.get(i).getName().equals(name)) {
				return Utill.학생목록.get(i);
			}
		}
		return null;
	}

	@Override
	public boolean 학생수정(Student stu) {
		
    	String name = stu.getName();
		String gender = stu.getGender();
		String id = stu.getId();
		String pw = stu.getPw();	
		
		for (int i = 0; i < Utill.학생목록.size(); i++) {
			if (Utill.학생목록.get(i).getName().equals(name)) {
				Utill.학생목록.remove(i);
				Utill.학생목록.add(new Student(name, gender, id, pw));

				System.out.println("정보가 수정 되었습니다.");
				
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean 학생삭제(Student stu) {
		
		String name = stu.getName();
		String gender = stu.getGender();
		String id = stu.getId();
		String pw = stu.getPw();
		
		for (int i = 0; i < Utill.학생목록.size(); i++) {
			if (Utill.학생목록.get(i).getName().equals(name)) {
				Utill.학생목록.remove(i);

				System.out.println("정보가 삭제 되었습니다.");
				
				return true;
			}
		}
		return false;
		
	
	}

}
