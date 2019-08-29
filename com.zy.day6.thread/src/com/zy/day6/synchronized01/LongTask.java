package com.zy.day6.synchronized01;

/**
 * ִ�к�ʱ�ϳ�������
 *
 */
public class LongTask {
	
	//����̹߳�����ڴ棬��ĳ��ʱ����ڣ�����߳̿���ͬʱ����changeNum�����޸�num��ֵ�������ᵼ���̰߳�ȫ����
	private int num = 0;
	
	Object obj = new Object();
	
	//ͬ�����첽
	public void changeNum(boolean flag){
		
		try {
			//�����������Ҫִ��һ����ʱ�ϳ������񣬲�����������漰���̰߳�ȫ����
			Thread.sleep(3000);
			System.out.println("ִ��һ����ʱ�ϳ�������");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//��������У���Ҫͬ���Ĵ�������ⲿ�֣��������ʱ�����Ĵ��룬���漰���̰߳�ȫ���⣬���Բ���Ҫͬ��
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
