package com.zy.day4.hotel;



public class Hotel {

	Room[][] room;
	
	//��ʼ�������ź�����
	public Hotel() {
		
		room = new Room[5][10];
		
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room[i].length; j++) {
				
				if (i==0 |i==1) {
					
					room[i][j] = new Room((i+1)*100+j+1+"","��׼��", false);
				}if(i==2 | i==3) {

					room[i][j] = new Room((i+1)*100+j+1+"","˫�˼�", false);
				}if (i == 4) {
					
					room[i][j] = new Room((i+1)*100+j+1+"","������", false);
				}
			}
			
		}
	}
	
	
	//�鿴����״̬
	public void print() {
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room[i].length; j++) {
				System.out.print(room[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//Ԥ������
	public void order(String id) {
		 for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room[i].length; j++) {
				if (room[i][j].getId().equals(id)) {
					//Ԥ���Ժ󽫷���״̬��Ϊtrue ��ռ��״̬
					room[i][j].setUse(true);
				}
			}
		}
	}
	
	//�˷�
	public void checkout(String id) {
		 for (int i = 0; i < room.length; i++) {
				for (int j = 0; j < room[i].length; j++) {
					if (room[i][j].getId().equals(id)) {
						//Ԥ���Ժ󽫷���״̬��Ϊtrue ��ռ��״̬
						room[i][j].setUse(false);
					}
				}
			}
	}
	
}
