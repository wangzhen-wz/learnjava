package com.zy.day6.synchronized01;

/**
 * 执行耗时较长的任务
 *
 */
public class LongTask {
	
	//多个线程共享堆内存，在某个时间段内，多个线程可以同时运行changeNum方法修改num的值，这样会导致线程安全问题
	private int num = 0;
	
	Object obj = new Object();
	
	//同步和异步
	public void changeNum(boolean flag){
		
		try {
			//假设下面代码要执行一个耗时较长的任务，并且这段任务不涉及到线程安全问题
			Thread.sleep(3000);
			System.out.println("执行一个耗时较长的任务");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//这个方法中，需要同步的代码块是这部分，而上面耗时操作的代码，不涉及到线程安全问题，所以不需要同步
		synchronized(obj){
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
	
	
}
