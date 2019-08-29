package com.zy.day6.thread01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

/*
 * timetask类实现可视化
 */
public class ThreadTime {
	public static void main(String[] args) throws ParseException {
		Timer t = new Timer();
		t.schedule(new MyTimeTask(), new SimpleDateFormat
				("yyyy-MM-dd hh:mm:ss SSS").parse("2019-7-16 14:07:00 000"),5000);
	}
}

class MyTimeTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("``````");
	}
	
}
