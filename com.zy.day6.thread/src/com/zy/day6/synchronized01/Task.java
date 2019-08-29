package com.zy.day6.synchronized01;

/**
 * 任务
 *
 */
public class Task {
	
	//多个线程共享堆内存，在某个时间段内，多个线程可以同时运行changeNum方法修改num的值，这样会导致线程安全问题
	private int num = 0;
	
	//同步和异步
	public synchronized void changeNum(boolean flag){
		if(flag){
			num = 88;
			
			System.out.println(Thread.currentThread().getName() + "========== begin");
			System.out.println(Thread.currentThread().getName() + "==========" + num);
			System.out.println(Thread.currentThread().getName() + "========== end");
		}else{
			num = 66;
			
			System.out.println(Thread.currentThread().getName() + "========== begin");
			System.out.println(Thread.currentThread().getName() + "==========" + num);
			System.out.println(Thread.currentThread().getName() + "========== end");
		}
	}
	
	
}
