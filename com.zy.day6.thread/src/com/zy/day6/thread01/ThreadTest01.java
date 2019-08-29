package com.zy.day6.thread01;

//使用run方法创建线程


//自定义一个类，集成java。lang包下的Thread类
class MyThread extends Thread {

	//重写润方法
	@Override
	public void run() {
		//将要在线程中执行的代码写在run方法内
		for (int i = 0; i < 1000; i++) {
			System.out.println("java!hello");
		}
	}
}

public class ThreadTest01{
	public static void main(String[] args) {
		//创建自定义的类
		MyThread mt = new MyThread();
		//调用start方法启动线程
		mt.start();
		
		//创建自定义的类
		MyThread mt1 = new MyThread();
		//调用start方法启动线程
		mt1.start();
				
		for (int i = 0; i < 1000; i++) {
			System.out.println("1024");
		}
	}
}
