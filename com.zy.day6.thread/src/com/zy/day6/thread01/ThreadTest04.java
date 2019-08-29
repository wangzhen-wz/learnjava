package com.zy.day6.thread01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 使用匿名内部类创建线程
 */
public class ThreadTest04 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Thread
		new Thread() {							//创建一个Thread类对象
			@Override							//重写run方法
			public void run() {
				for (int i = 0; i < 100; i++) {	//将要在线程中执行的代码写在run方法中
					System.out.println("java");
				}
			}
		}.start();								//启动线程
		
		//Runnable
		new Thread(new Runnable() {				//创建一个runnable类对象
			
			@Override
			public void run() {					//重写run方法
				for (int i = 0; i < 100; i++) {	//将要在线程中执行的代码写在run方法中
					System.out.println("hello");
				}
			}
		}).start();								//启动线程
		
		//Callable
		ExecutorService es = Executors.newCachedThreadPool();//创建线程池	
		Future<Integer> result = es.submit(new Callable<Integer>() {//创建callable对象
																//将callable对象放在线程中
			@Override											//获取线程返回的future对象
			public Integer call() throws Exception {
				return 88;
			}
		});
		System.out.println(result.get());						//获取线程计算的返回结果
		es.shutdown();											//关闭线程池
	}	
}
