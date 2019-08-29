package com.zy.day5.class01;

public class BoxTest01 {

	public static void main(String[] args) {

		//自动装箱就是基本数据类型自动转换为相应的包装类
		Integer i1 = 10;
		
		//自动拆箱，与之相反
		@SuppressWarnings("deprecation")
		Integer i2 = new Integer(20);
		int i3 = i2;
		
		Integer i4 = 888;//相当于new Integer（888）
		Integer i5 =  888;
		
		System.out.println(i4 == i5);
		//判断两个Integer类型是否相等
		System.out.println(i4.equals(i5));
		
		Integer i6 = 127;
		Integer i7 = 127;
		System.out.println(i6 == i7);
		
		
	}

}
