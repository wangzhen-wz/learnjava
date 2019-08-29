package com.zy.day3.interface01;

interface A {

	public static final double PI = 3.1415926;
	double PI2 = 3.1415927;
	
	public abstract void m1();
	//public abstract 是可以省略的
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
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void m1() {
		// TODO 自动生成的方法存根
		
	}
	
}