package com.zy.day6.synchronized01;

/**
 * ��һ����ʱ�ϳ�������ŵ������߳��У������������߳�ִ�н����������ѵ�ʱ��
 *
 */
public class SynchronizedTest02 {
	
	public static long begin1;
	public static long end1;
	public static long begin2;
	public static long end2;
	
	
	public static void main(String[] args) {
		
		LongTask longTask = new LongTask();
		
		Thread t1 = new Thread(){
			public void run(){
				begin1 = System.currentTimeMillis();
				//ִ�к�ʱ�ϳ������񷽷�
				longTask.changeNum(true);
				end1 = System.currentTimeMillis(); 
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				begin2 = System.currentTimeMillis();
				//ִ�к�ʱ�ϳ������񷽷�
				longTask.changeNum(false);
				end2 = System.currentTimeMillis(); 
			}
		};
		
		t1.start();
		t2.start();
		
		
		//�������߳�˯�ߣ���֤t1��t2�߳�ִ�����֮���ټ���ʱ��
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long begin = 0;
		long end = 0;
		
		//����ִ�е��̵߳�ʱ������ִ���̵߳�ʱ���ȡ��
		if(begin1 > begin2){
			begin = begin2;
		}else{
			begin = begin1;
		}
		
		if(end1 > end2){
			end = end1;
		}else{
			end = end2;
		}
		
		System.out.println("�����߳��ܹ���ʱ��" + (end -begin)/1000 + "��");
		
	}

}
