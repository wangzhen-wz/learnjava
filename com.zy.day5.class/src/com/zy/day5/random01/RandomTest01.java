package com.zy.day5.random01;

import java.util.Random;

//Random�����

public class RandomTest01 {

	public static void main(String[] args) {
		
		Random r1 = new Random();
		System.out.println(r1.nextInt(101));//����100���ڵ������
		
		for (int i = 0; i < 5 ; i++) {
			System.out.println(r1.nextInt(101));
		}
	}
}
