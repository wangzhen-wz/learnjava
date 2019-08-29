package com.zy.day3.inherit;

public class Dog extends Animal {

	public String name = "wangcai";
	
	public void eat() {
		System.out.println("eat gouliang");
	}
	
	public Dog() {
		super("土豪金","藏獒");//如果没有super，系统会默认调用一个super构造方法
		System.out.println("dog中的无参构造方法");
	}
	
	public void m1() {
		System.out.println(super.name);
		System.out.println(this.name);
		super.eat();
		this.eat();
	}
}
