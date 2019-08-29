package com.zy.day5.shoppingcar;

import java.math.BigDecimal;

/**
 * ���⣺ʵ��һ�����ﳵ�Ĺ���
 * ������
 *     ����һ��Product��Ʒ��
 *     ����һ��ShopCart���ﳵ��
 *     ����һ��������Exercise06
 * 
 */
public class ShopCartTest {

	public static void main(String[] args) {
		Product orange = new Product(1001,"����", BigDecimal.valueOf(10));
		Product apple = new Product(1002,"ƻ��", BigDecimal.valueOf(15));
		Product grape = new Product(1003,"����", BigDecimal.valueOf(20));
		Product banana = new Product(1004,"�㽶", BigDecimal.valueOf(5));
		
		ShopCart sc = new ShopCart();
		sc.add(apple, 5);
		sc.add(orange, 10);
		sc.add(banana, 4);
		sc.add(grape, 20);
		sc.add(apple, 5);
		
//		sc.remove(apple, 5);
//		
//		sc.clear();
		
		sc.print();
	}
	
}
