package com.zy.day3.constructor1;


public class User {

	private String name;
	private int age;
	
	//���Ҫ���޲ι��췽�����вι��췽��
	
	public User() {	
		System.out.println("���췽��");
	}
	public User(String nameString,int age1) {
		name = nameString;
		age = age1;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
