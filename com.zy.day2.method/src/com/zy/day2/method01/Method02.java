package com.zy.day2.method01;

public class Method02 {

	public static void main(String[] args) {
		
		//�������������е��õ�ʱ����Ҫ�����������ķ�ʽ
		Method03.m1();
		
		//ͬһ�����������ַ�ʽ������
		Method02.m1();
		m1();
	}
	
	public static void m1() {
		
		System.out.println("m1");
	}
}

class Method03{
	public static void m1() {
		System.out.println("Method03���m1����");
	}
}
