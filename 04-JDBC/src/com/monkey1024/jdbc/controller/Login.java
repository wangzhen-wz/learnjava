package com.monkey1024.jdbc.controller;

import java.util.Scanner;

import com.monkey1024.jdbc.bean.User;
import com.monkey1024.jdbc.service.LoginServiceNew;

/**
 * ʵ���û���¼����
 *
 */
public class Login {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������û�����");
		String name = input.nextLine();
		System.out.println("���������룺");
		String password = input.nextLine();
		
		//LoginService ls = new LoginService();
		LoginServiceNew ls = new LoginServiceNew();
		User u = ls.findUserByNameAndPassword(name, password);
		if(u == null){
			System.out.println("�û������������!");
		}else{
			System.out.println("��¼�ɹ�!");
		}
	}

}
