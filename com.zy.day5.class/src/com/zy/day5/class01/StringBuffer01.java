package com.zy.day5.class01;

public class StringBuffer01 {

	public static void main(String[] args) {

		
		//stringbuffer��stringbuilder����һ��
		//stringbuffer�߳��ǰ�ȫ�ģ���Ч�ʵ�
		//stringbuilder�߳��ǲ���ȫ�ģ�Ч�ʸ�
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());//stringbuffer��Ĭ�ϳ���Ϊ16
		
		//����Ԥ���ַ����ĳ��Ȳ�������stringbuffer�ĳ���
		StringBuffer sb1 = new StringBuffer(100);
		System.out.println(sb1.capacity());
		
		//�������string���ͻ������ʼ������Ϊstring.length+16
		StringBuffer sb2 = new StringBuffer("monkey");
		System.out.println(sb2.capacity());
		
		
		//ʹ��stringbuffer�����ַ�����ƴ��
		StringBuffer sb3 = new StringBuffer(30);
		sb3.append("www");
		sb3.append(".");
		sb3.append("monkey1024");
		sb3.append(".");
		sb3.append("com");
		System.out.println(sb3);
		
		//stringbuffer����ַ�����ָ��λ��
		sb3.insert(4, "1024");
		System.out.println(sb3);
		
		//stringbufferɾ��ָ��λ�õ��ַ���
		sb3.delete(4, 8);
		System.out.println(sb3);
	}

}
