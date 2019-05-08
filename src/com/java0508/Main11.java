package com.java0508;

import java.util.ArrayList;
import java.util.List;

public class Main11 implements Main11Interface {
	
	static List<Student> 학생목록 = new ArrayList<Student>();

	@Override
	public boolean 학생추가(Student stu) {
		
		boolean check = true;
		String name = stu.getName();
		String gender = stu.getGender();
		String id = stu.getId();
		String pw = stu.getPw();
		
		Student 신규 = new Student(name, gender, id, pw);
		학생목록.add(신규);
		
		if(stu != null) {
			System.out.println(name+"님이 등록되었습니다.");
			check = false;
		}
		
		for (int i = 0; i < 학생목록.size(); i++) {
			if (학생목록.get(i).getName().equals(name)) {
				System.out.println("이름  : " + 학생목록.get(i).getName() );
				System.out.println("성별  : " + 학생목록.get(i).getGender() );
				System.out.println("ID    : " + 학생목록.get(i).getId() );
				System.out.println("PW  : " + 학생목록.get(i).getPw() );
				check = false;
			}
		}
		if (check) {
			System.out.println("검색한 이름은 사용자 목록에 없습니다.");
		}
		else {
			System.out.println("검색한 이름은 사용자 목록에 없습니다.");
		}
		
		return check;
	}

	@Override
	public Student 학생검색(String name) {
		
		for (int i = 0; i < 학생목록.size(); i++) {
			if (학생목록.get(i).getName().equals(name)) {
				return 학생목록.get(i);
			}
		}
		return null;
	}

	@Override
	public boolean 학생수정(Student stu) {
				
		return false;
	}

	@Override
	public boolean 학생삭제(Student stu) {
		
		return false;
	}

}
