package com.zy.day2.method01;

/*
 * ruturn �ǽ��������ģ�������䲻�ᱻִ��
 */
public class Method04 {

	public static void main(String[] args) {
		
		int result = sumInt(10,20);
		System.out.println("�������ǣ�"+result);
	}

	private static int sumInt(int i, int j) {
		// TODO �Զ����ɵķ������
		
		int  c = i + j;
		
		return c;
	}
	
	public static boolean m1(int i) {
		if (i == 0) {
			return true;
		}
		return false;
	}
	
	public static Long sumLong(Long a,Long b) {
		return a+b;
	}
}
