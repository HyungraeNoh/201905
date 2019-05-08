package com.java0508;

public interface Main11Interface {
		
	//4개의 기능을 추상 메소드로 선언 한다.
	public boolean 학생추가(Student stu);
	public Student 학생검색(String name);
	public boolean 학생수정(Student stu);
	public boolean 학생삭제(Student stu);
}
