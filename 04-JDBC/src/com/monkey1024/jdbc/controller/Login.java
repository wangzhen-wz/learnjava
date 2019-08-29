package com.monkey1024.jdbc.controller;

import java.util.Scanner;

import com.monkey1024.jdbc.bean.User;
import com.monkey1024.jdbc.service.LoginServiceNew;

/**
 * 实现用户登录功能
 *
 */
public class Login {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = input.nextLine();
		System.out.println("请输入密码：");
		String password = input.nextLine();
		
		//LoginService ls = new LoginService();
		LoginServiceNew ls = new LoginServiceNew();
		User u = ls.findUserByNameAndPassword(name, password);
		if(u == null){
			System.out.println("用户名或密码错误!");
		}else{
			System.out.println("登录成功!");
		}
	}

}
