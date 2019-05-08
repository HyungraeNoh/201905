package com.java0508;

public class Student {
	
	public Student(String name, String gender, String id, String pw) {
		setName(name);
		setGender(gender);
		setId(id);
		setPw(pw);
	}
	
	private String name;
	private String gender;
	private String id;
	private String pw;
	
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	private void setGender(String gender) {
		this.gender = gender;
	}
	public String getId() {
		return id;
	}
	private void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	private void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override  //오버라이드로 String을 바로 보여준다. <Source -> toString>
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", id=" + id + ", pw=" + pw + "]";
	}
	
	
}
