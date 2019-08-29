package com.zy.day2.method01;

public class Method02 {

	public static void main(String[] args) {
		
		//如果方法跨类进行调用的时候，需要采用类名。的方式
		Method03.m1();
		
		//同一个类里面两种方式都可以
		Method02.m1();
		m1();
	}
	
	public static void m1() {
		
		System.out.println("m1");
	}
}

class Method03{
	public static void m1() {
		System.out.println("Method03里的m1方法");
	}
}
