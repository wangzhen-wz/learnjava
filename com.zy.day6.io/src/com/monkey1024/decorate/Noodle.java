package com.monkey1024.decorate;

public class Noodle implements NoodleDecorate{
	
	/**
	 * ����һ����ͨ������
	 */
	@Override
	public void addThings() {
		System.out.println("��һ����ĩ");
		System.out.println("����Ƭ���ܲ�");
		System.out.println("���������");
	}

}
