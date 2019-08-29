package com.zy.day6.communication;

/**
 * 三个（三个以上）线程之间的通信
 *
 */
public class NotifyAllTest01 {

	public static void main(String[] args) {
		
		Print1 p = new Print1();
		
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

class Print1{
	
	private int flag = 1;
	
	public void print1(){
		synchronized(this){
			while(flag != 1){
				try {
					//让当前线程进入等待状态
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("monkey");
			flag = 2;
			//唤醒所有等待的线程
			this.notifyAll();
		}
		
	}
	//wait 释放对象锁
	//sleep 不释放
	//notify 不释放
	public void print2(){
		synchronized(this){
			while(flag != 2){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("1024");
			flag = 3;
			this.notifyAll();
		}
		
	}
	
	public void print3(){
		synchronized(this){
			while(flag != 3){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("888");
			flag = 1;
			this.notifyAll();
		}
		
	}
}