package com.zy.day6.volatiletest;

public class Task implements Runnable{
	
	private volatile boolean flag = true;

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		while(flag){
			System.out.println("whileÑ­»·");
		}
		System.out.println("Ñ­»·½áÊø");
	}
	
	
}