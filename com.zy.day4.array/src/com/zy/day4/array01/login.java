package com.zy.day4.array01;

public class login {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("请输入用户名和密码，中间以空格隔开");
			return;
		}
		String name = args[0];
		String passwprd = args[1];
		if ("admin".equals(name) && "monkey1024".equals(passwprd)) {
			System.out.println("登陆成功，欢迎" + name + "回来");
		} else {
			System.out.println("用户名或密码错误，请重新输入");
		}
	}

}
