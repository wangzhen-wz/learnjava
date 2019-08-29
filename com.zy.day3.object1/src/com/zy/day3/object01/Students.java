package com.zy.day3.object01;

/*
 * 一个抽象过程
 * 定义一个学生类
 */
public class Students {

	//成员变量可以不进行初始化
	//学号
	int id;
	
	//姓名
	String name;
	
	//性别
	boolean nex;
	
	//年龄
	int age;
	
	public void study() {
		System.out.println("好好学习，天天向上！");
	}
	
	public void love(String name) {
		System.out.println("我在跟" + name + "谈恋爱");
	}
	
	public void takeExcrises(String sport) {
		System.out.println("我在做" + sport + "运动");
	}
}
