package com.zy.day3.variable;

public class Variable {

	//成员变量
	byte b;
	
	public static void main(String[] args) {
		
		//局部变量
		int i = 10;
		Variable var = new Variable();
		System.out.println(var.b );
	}
	public static void m1() {
		//局部变量
		int i = 5;
	}
}
 