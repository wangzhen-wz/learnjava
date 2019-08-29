package com.zy.day5.data01;

public class DataTest01 {

	public static void main(String[] args) {

		//获取毫秒数
		//从1970.1.1.00时00分00秒到现在所在的毫秒数
		long now = System.currentTimeMillis();
		System.out.println(now);
		
		//演示string类和stringbuffer类拼接1000次所耗费的时间
		String s = "";
		StringBuffer sb = new StringBuffer(1000);
		
		//获取拼接前的毫秒数
		long befor = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			/* s += i ; */
			sb.append(i);
		}
		//获取拼接后的毫秒数
		long after = System.currentTimeMillis();
		System.out.println(after - befor);
	}

}
