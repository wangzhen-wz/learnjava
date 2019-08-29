package com.zy.day6.volatiletest;

public class VolatileTest01 {

	public static void main(String[] args) throws InterruptedException {
		
		Task task = new Task();
		
		Thread t1 = new Thread(task);
		t1.start();
		
		Thread.sleep(10);
		task.setFlag(false);
	}

}
