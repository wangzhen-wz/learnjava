package com.zy.day5.class01;

public class StringBuffer01 {

	public static void main(String[] args) {

		
		//stringbuffer与stringbuilder方法一样
		//stringbuffer线程是安全的，但效率低
		//stringbuilder线程是不安全的，效率高
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());//stringbuffer的默认长度为16
		
		//建议预估字符串的长度并且声明stringbuffer的长度
		StringBuffer sb1 = new StringBuffer(100);
		System.out.println(sb1.capacity());
		
		//如果传入string类型化，则初始化长度为string.length+16
		StringBuffer sb2 = new StringBuffer("monkey");
		System.out.println(sb2.capacity());
		
		
		//使用stringbuffer进行字符串放拼接
		StringBuffer sb3 = new StringBuffer(30);
		sb3.append("www");
		sb3.append(".");
		sb3.append("monkey1024");
		sb3.append(".");
		sb3.append("com");
		System.out.println(sb3);
		
		//stringbuffer添加字符串到指定位置
		sb3.insert(4, "1024");
		System.out.println(sb3);
		
		//stringbuffer删除指定位置的字符串
		sb3.delete(4, 8);
		System.out.println(sb3);
	}

}
