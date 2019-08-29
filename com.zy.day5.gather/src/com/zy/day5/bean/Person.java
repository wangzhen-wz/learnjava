package com.zy.day5.bean;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.age=age;
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
 
}
