package com.zy.day3.interface01;

interface A {

	public static final double PI = 3.1415926;
	double PI2 = 3.1415927;
	
	public abstract void m1();
	//public abstract �ǿ���ʡ�Ե�
	//void m1();
	
}
interface b{
	void m2();
}

interface c extends A,b{
	void m3();
}

class MyClass implements A,b{

	@Override
	public void m2() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void m1() {
		// TODO �Զ����ɵķ������
		
	}
	
}