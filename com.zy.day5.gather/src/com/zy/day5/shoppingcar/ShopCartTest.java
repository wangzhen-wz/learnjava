package com.zy.day5.shoppingcar;

import java.math.BigDecimal;

/**
 * 问题：实现一个购物车的功能
 * 分析：
 *     创建一个Product商品类
 *     创建一个ShopCart购物车类
 *     创建一个测试类Exercise06
 * 
 */
public class ShopCartTest {

	public static void main(String[] args) {
		Product orange = new Product(1001,"橘子", BigDecimal.valueOf(10));
		Product apple = new Product(1002,"苹果", BigDecimal.valueOf(15));
		Product grape = new Product(1003,"葡萄", BigDecimal.valueOf(20));
		Product banana = new Product(1004,"香蕉", BigDecimal.valueOf(5));
		
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
