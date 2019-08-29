package com.monkey1024.serializable;

import java.io.Serializable;

/**
 * 如果一个类的对象支持序列化和反序列化，需要实现Serializable
 * Serializable中没有任何方法
 */
public class Student implements Serializable{
	
	
	/**
	 * 自动生成序列化版本号
	 */
	private static final long serialVersionUID = -716323668524282676L;

	private String name;
	
	//添加属性后，使用反序列化时会报出InvalidClassException
	//transient修饰的变量不会被序列化
	transient private int age;
	
	private boolean sex;
	
	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
