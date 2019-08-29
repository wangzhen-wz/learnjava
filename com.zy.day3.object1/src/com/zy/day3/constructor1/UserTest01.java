package com.zy.day3.constructor1;

public class UserTest01 {

	public static void main(String[] args) {
		
//		User u = new User();不能手动调用构造方法
		User user = new User("zaoliu",20);
		System.out.println(user.getName());
		System.out.println(user.getAge());
	}
}
