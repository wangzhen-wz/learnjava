package com.zy.day3.constructor1;

public class UserTest01 {

	public static void main(String[] args) {
		
//		User u = new User();�����ֶ����ù��췽��
		User user = new User("zaoliu",20);
		System.out.println(user.getName());
		System.out.println(user.getAge());
	}
}
