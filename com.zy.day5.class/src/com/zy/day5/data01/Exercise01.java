package com.zy.day5.data01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//编写代码获取2008.8.8星期几

public class Exercise01 {

	public static void main(String[] args) throws ParseException {
		
		String st = "2008年8月8日";
		//将字符串转换为data类型
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Date d = sdf.parse(st);
		
		//将calender的时间改为2008年8月8日
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	}
}
