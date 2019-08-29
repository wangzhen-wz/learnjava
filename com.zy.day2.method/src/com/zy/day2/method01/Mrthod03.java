package com.zy.day2.method01;
/*
 * 方法的执行顺序是从main方法开始，自上而下执行的
 * 在编写方法是2不要出现方法的互相调用，不然会导致StackOverFlow错误：栈溢出
 */
public class Mrthod03 {

	public static void main(String[] args) {
		m1();
		m2();
		m3();
		m4();
		m5();
	}
	
	public static void m1() {
		System.out.println("m1");
	}
	
	public static void m2() {
		System.out.println("m2");
	}
	
	public static void m3() {
		System.out.println("m3");
	}
	
	public static void m4() {
		System.out.println("m4");
	}
	
	public static void m5() {
		System.out.println("m5");
	}
}
