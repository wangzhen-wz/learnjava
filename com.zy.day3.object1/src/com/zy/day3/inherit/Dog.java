package com.zy.day3.inherit;

public class Dog extends Animal {

	public String name = "wangcai";
	
	public void eat() {
		System.out.println("eat gouliang");
	}
	
	public Dog() {
		super("������","����");//���û��super��ϵͳ��Ĭ�ϵ���һ��super���췽��
		System.out.println("dog�е��޲ι��췽��");
	}
	
	public void m1() {
		System.out.println(super.name);
		System.out.println(this.name);
		super.eat();
		this.eat();
	}
}
