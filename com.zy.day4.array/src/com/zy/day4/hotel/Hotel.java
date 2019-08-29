package com.zy.day4.hotel;



public class Hotel {

	Room[][] room;
	
	//初始化房间编号和类型
	public Hotel() {
		
		room = new Room[5][10];
		
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room[i].length; j++) {
				
				if (i==0 |i==1) {
					
					room[i][j] = new Room((i+1)*100+j+1+"","标准间", false);
				}if(i==2 | i==3) {

					room[i][j] = new Room((i+1)*100+j+1+"","双人间", false);
				}if (i == 4) {
					
					room[i][j] = new Room((i+1)*100+j+1+"","豪华间", false);
				}
			}
			
		}
	}
	
	
	//查看房间状态
	public void print() {
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room[i].length; j++) {
				System.out.print(room[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//预订房间
	public void order(String id) {
		 for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room[i].length; j++) {
				if (room[i][j].getId().equals(id)) {
					//预定以后将房间状态改为true ，占用状态
					room[i][j].setUse(true);
				}
			}
		}
	}
	
	//退房
	public void checkout(String id) {
		 for (int i = 0; i < room.length; i++) {
				for (int j = 0; j < room[i].length; j++) {
					if (room[i][j].getId().equals(id)) {
						//预定以后将房间状态改为true ，占用状态
						room[i][j].setUse(false);
					}
				}
			}
	}
	
}
