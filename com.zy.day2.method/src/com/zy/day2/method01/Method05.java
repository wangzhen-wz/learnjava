package com.zy.day2.method01;

/*
 * 方法重载
 * 需要在同一个类里面
 * 方法名相同
 * 参数列表不同：参数类型，个数，顺序
 * 方法重载和返回值类型没有关系
 * 重载和修饰符列表没有关系
 */

public class Method05 {

	public static void main(String[] args) {
	
		System.out.println();
	}
	
	//参数个数不同，m1方法重载
	public static void m1() {
		
	}
	public static void m1(int i) {
		
	}
	
	//参数类型不同，m2方法重载
	public static void m2(int i) {
		
	}
	public static void m2(Long i) {
		
	}
	
	//参数顺序不同，m3 构成重载，但开发之中不这样使用
	public static void m3(int i,long j) {
		
	}
	public static void m3(long i,int j) {
		
	}
}
