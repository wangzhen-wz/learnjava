package com.monkey1024.decorate;

public class ChiliNoodle implements NoodleDecorate {
	
	//��ͨ����
	private Noodle noodle;
	
	
	//����Ҫ����������ͨ�������
	public ChiliNoodle(Noodle noodle) {
		this.noodle = noodle;
	}

	/**
	 * ����ͨ���������������������
	 */
	@Override
	public void addThings() {
		noodle.addThings();
		System.out.println("������������");
	}

}
