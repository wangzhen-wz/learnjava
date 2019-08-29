package com.zy.day6.communication;

/**
 * �����߳�֮���ͨ��
 * �������߳̽����ڿ���̨���һ������
 *
 */
public class NotifyTest01 {

	public static void main(String[] args) {
		
		Print p = new Print();
		
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
		
		t1.start();
		t2.start();
	}

}

class Print{
	
	private int flag = 1;
	
	public void print1(){
		synchronized(this){
			if(flag != 1){
				try {
					//�õ�ǰ�߳̽���ȴ�״̬
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("monkey");
			flag = 2;
			//����Ļ��ѵ����ȴ����߳�
			this.notify();
		}
		
	}
	
	public void print2(){
		synchronized(this){
			if(flag != 2){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("1024");
			flag = 1;
			this.notify();
		}
		
	}
}