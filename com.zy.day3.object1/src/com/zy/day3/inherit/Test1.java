package com.zy.day3.inherit;
/*
 * ���಻�ܷ��ʸ�����private����
 */
public class Test1 {

	public static void main(String[] args) {
		SubClass  s = new SubClass();
		s.m1();
		s.m2();
		s.m3();
		s.m0();//�����ǿ��Է��ʵ���������ķ���
	}
}
