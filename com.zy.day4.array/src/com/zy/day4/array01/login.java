package com.zy.day4.array01;

public class login {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("�������û��������룬�м��Կո����");
			return;
		}
		String name = args[0];
		String passwprd = args[1];
		if ("admin".equals(name) && "monkey1024".equals(passwprd)) {
			System.out.println("��½�ɹ�����ӭ" + name + "����");
		} else {
			System.out.println("�û����������������������");
		}
	}

}
