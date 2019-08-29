package com.zy.day4.exceptiom01;

public class ExceptionTest01 {

	public static void main(String[] args) {
		int a = 1024;
		int b = 0;

		if (b == 0) {
			System.out.println(":被除数不能为0");
		}else {
			int c = a / b;
		}
		System.out.println("~~~~~~~~~");
	}
}
