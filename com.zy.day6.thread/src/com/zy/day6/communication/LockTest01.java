package com.zy.day6.communication;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用ReenTrantLock唤醒指定线程
 *
 */
public class LockTest01 {

	public static void main(String[] args) {
		
		Print2 p = new Print2();
		
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					p.print1();
				}
				
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					p.print2();
				}
			}
		};
		
		Thread t3 = new Thread(){
			public void run(){
				while(true){
					p.print3();
				}
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
	}

}

class Print2{
	
	//互斥锁
	private ReentrantLock r = new ReentrantLock();
	//监视器
	private Condition c1 = r.newCondition();
	private Condition c2 = r.newCondition();
	private Condition c3 = r.newCondition();
	
	private int flag = 1;
	
	public void print1(){
		//在要开始同步的地方加上锁
		r.lock();
		while(flag != 1){
			try {
				//让当前线程进入等待状态
				c1.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("monkey");
		flag = 2;
		//随机的唤醒c2线程
		c2.signal();
		//在执行结束后释放锁
		r.unlock();
	}
	//wait 释放对象锁
	//sleep 不释放
	//notify 不释放
	public void print2(){
		r.lock();
		while(flag != 2){
			try {
				c2.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("1024");
		flag = 3;
		//唤醒c3线程
		c3.signal();
		r.unlock();
		
	}
	
	public void print3(){
		r.lock();
		while(flag != 3){
			try {
				c3.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("888");
		flag = 1;
		c1.signal();
		r.unlock();
		
	}
}