package com.zy.day5.class01;

public class BoxTest01 {

	public static void main(String[] args) {

		//�Զ�װ����ǻ������������Զ�ת��Ϊ��Ӧ�İ�װ��
		Integer i1 = 10;
		
		//�Զ����䣬��֮�෴
		@SuppressWarnings("deprecation")
		Integer i2 = new Integer(20);
		int i3 = i2;
		
		Integer i4 = 888;//�൱��new Integer��888��
		Integer i5 =  888;
		
		System.out.println(i4 == i5);
		//�ж�����Integer�����Ƿ����
		System.out.println(i4.equals(i5));
		
		Integer i6 = 127;
		Integer i7 = 127;
		System.out.println(i6 == i7);
		
		
	}

}
