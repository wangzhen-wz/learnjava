package com.zy.day5.data01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//��д�����ȡ2008.8.8���ڼ�

public class Exercise01 {

	public static void main(String[] args) throws ParseException {
		
		String st = "2008��8��8��";
		//���ַ���ת��Ϊdata����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		Date d = sdf.parse(st);
		
		//��calender��ʱ���Ϊ2008��8��8��
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	}
}
