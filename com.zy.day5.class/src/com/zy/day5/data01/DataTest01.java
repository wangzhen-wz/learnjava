package com.zy.day5.data01;

public class DataTest01 {

	public static void main(String[] args) {

		//��ȡ������
		//��1970.1.1.00ʱ00��00�뵽�������ڵĺ�����
		long now = System.currentTimeMillis();
		System.out.println(now);
		
		//��ʾstring���stringbuffer��ƴ��1000�����ķѵ�ʱ��
		String s = "";
		StringBuffer sb = new StringBuffer(1000);
		
		//��ȡƴ��ǰ�ĺ�����
		long befor = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			/* s += i ; */
			sb.append(i);
		}
		//��ȡƴ�Ӻ�ĺ�����
		long after = System.currentTimeMillis();
		System.out.println(after - befor);
	}

}
