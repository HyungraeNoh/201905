package com.java0508;

public class Test implements TestInterface, Test1Interface {

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void print() {

	}

	@Override
	public void add(int a) {
		System.out.println(a);
	}
}
