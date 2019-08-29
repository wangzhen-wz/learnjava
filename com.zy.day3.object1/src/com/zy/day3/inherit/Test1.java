package com.zy.day3.inherit;
/*
 * 子类不能访问父类中private方法
 */
public class Test1 {

	public static void main(String[] args) {
		SubClass  s = new SubClass();
		s.m1();
		s.m2();
		s.m3();
		s.m0();//子类是可以访问到其祖先类的方法
	}
}
