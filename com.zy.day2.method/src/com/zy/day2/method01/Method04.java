package com.zy.day2.method01;

/*
 * ruturn 是结束方法的，后面语句不会被执行
 */
public class Method04 {

	public static void main(String[] args) {
		
		int result = sumInt(10,20);
		System.out.println("计算结果是："+result);
	}

	private static int sumInt(int i, int j) {
		// TODO 自动生成的方法存根
		
		int  c = i + j;
		
		return c;
	}
	
	public static boolean m1(int i) {
		if (i == 0) {
			return true;
		}
		return false;
	}
	
	public static Long sumLong(Long a,Long b) {
		return a+b;
	}
}
