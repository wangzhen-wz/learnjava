package com.zy.day3.constructor1;


public class User {

	private String name;
	private int age;
	
	//最好要有无参构造方法和有参构造方法
	
	public User() {	
		System.out.println("构造方法");
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
