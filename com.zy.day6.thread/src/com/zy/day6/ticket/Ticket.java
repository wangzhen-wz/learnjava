package com.zy.day6.ticket;

/**
 * ��ϰ��ʹ�ö��̳߳���ģ���ӰƱ�����Ĺ��̣�һ����100�ŵ�ӰƱ��3����˾��������
 * ��������100�ŵ�ӰƱ��Ϊ��Ա���������������߳̿�ʼִ�У�ÿ���߳�ִ��һ�Σ�Ʊ��������һ
 */
public class Ticket implements Runnable{

	//100�ŵ�ӰƱ
	private int count = 100;

	@Override
	public void run() {
		while(true){
			synchronized(this){
				if(count <= 0){
					break;
				}else{
					//����ӰƱ�������Լ�����
					count--;
					System.out.println(Thread.currentThread().getName() + "����һ�ţ�ʣ��" + count + "��");
				}
			}
				
		}
	}
}