package com.zy.day6.thread01;

import java.io.IOException;
import java.nio.CharBuffer;

//自定义一个类，集成java。lang包下的runnable类
class MyRunnable implements Runnable{

	//重写run方法
	@Override
	public void run() {
		//将要在线程中执行的代码写在run方法内
		for (int i = 0; i < 1000; i++) {
			System.out.println("java!hello");
		}
	}
	
}

public class ThreadTest02 {
	
	public static void main(String[] args) {

		//创建自定义的类
		MyRunnable mr1 = new MyRunnable();
		//创建一个Thread对象并将上面定义类的对象作参数传递给Thread的构造方法
		Thread t1 =new Thread(mr1);
		//调用start方法启动线程
		t1.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("1024");
		}
	}

}
