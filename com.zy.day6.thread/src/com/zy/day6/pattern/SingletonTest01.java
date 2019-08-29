package com.zy.day6.pattern;

/**
 * ����ģʽ����֤���������ʱ��ĳ�������ڴ���ֻ��һ������
 *
 */
public class SingletonTest01 {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
	}

}

//����ʽ���������ӳټ���
class Singleton{
	//1.���췽��˽�л�
	private Singleton(){
		
	}
	
	//2.������ǰ������ã�ʹ��volatile����
	private volatile static Singleton s = null;
	
	//3.�����ṩ������ͬ���ķ��ʷ�����������¶���ⲿ
	public synchronized static Singleton getInstance(){
		if(s == null){
			s = new Singleton();
		}
		
		return s;
	}
}

//����ʽ
/*class Singleton{
	
	//1.���췽��˽�л�
	private Singleton(){
		
	}
	
	//2.������ǰ��Ķ���
	private static Singleton s = new Singleton();
	
	//3.��������������������¶���ⲿ
	public static Singleton getInstance(){
		return s;
	}
}*/