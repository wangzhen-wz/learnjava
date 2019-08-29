package com.monkey1024.serializable;

import java.io.Serializable;

/**
 * ���һ����Ķ���֧�����л��ͷ����л�����Ҫʵ��Serializable
 * Serializable��û���κη���
 */
public class Student implements Serializable{
	
	
	/**
	 * �Զ��������л��汾��
	 */
	private static final long serialVersionUID = -716323668524282676L;

	private String name;
	
	//������Ժ�ʹ�÷����л�ʱ�ᱨ��InvalidClassException
	//transient���εı������ᱻ���л�
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
