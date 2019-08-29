package com.zy.day6.thread01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

////自定义一个类，集成java。util.concurrent包下的Callable接口
class MyCallable implements Callable<Integer>{

	//阶乘
	private int count;
	
	public MyCallable(int i) {
		// TODO 自动生成的构造函数存根
	}
	//重写call（）方法
	@Override
	public Integer call() throws Exception {
		//将要在线程中执行的代码编写在call（）方法中
		int sum = 1;
		if (count != 0) {
			for (int i = 0; i <= count; i++) {
				sum *= i;
			}
		} else {
			sum = 0;
		}
		return sum;
	}
}


public class ThreadTest03 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		//创建一个ExecutorService线程池
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		//创建一个ExecutorService线程池,里面的线程会根据任务数量进行增加
		ExecutorService es1 = Executors.newCachedThreadPool();
		
		//将自定义的对象放在线程池里面
		Future<Integer> f1 = es.submit(new MyCallable(5));
		Future<Integer> f2 = es.submit(new MyCallable(3));
		
		//获取线程的返回结果
//		if (f1.isDone()) {
//			System.out.println(f1.get());
//		} else {
//			System.out.println("f1线程中的任务还未执行完毕");
//		}if (f1.isDone()) {
//			System.out.println(f1.get());
//		} else {
//			System.out.println("f2线程中的任务还未执行完毕");
//		}
		System.out.println(f1.get());
		System.out.println(f1.get());
		
		//关闭线程池
		es.shutdown();
	}

}
