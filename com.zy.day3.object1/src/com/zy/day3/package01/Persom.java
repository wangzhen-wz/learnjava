package com.zy.day3.package01;

/*
 * 封装
 * 封装是把隐藏对象的属性和实现细节，仅对外提供公共服务
 * 优点：隐藏代码的细节，提高安全性
 */
class Persom {

	private String name;
	
	private int age;
	

	//对外提供公共的访问方式，填写get和set方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
