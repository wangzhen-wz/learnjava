package com.zy.day6.ticket;

public class TicketTest {

	public static void main(String[] args) {
		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		
		t1.setName("è�۵�Ӱ");
		t2.setName("Ŵ�׵�Ӱ");
		t3.setName("���ŵ�Ӱ");
		
		t2.start();
		t3.start();
		t1.start();
	}

}

