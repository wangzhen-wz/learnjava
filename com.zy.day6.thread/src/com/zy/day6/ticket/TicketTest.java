package com.zy.day6.ticket;

public class TicketTest {

	public static void main(String[] args) {
		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		
		t1.setName("猫眼电影");
		t2.setName("糯米电影");
		t3.setName("美团电影");
		
		t2.start();
		t3.start();
		t1.start();
	}

}

