package com.zy.day5.data01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//��һ����������������������
public class Exercision {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		String str = "1997-06-02";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = sdf.parse(str);
		long now = d.getTime();
		long birth = birthday.getTime();
		
		long day = now - birth;
		
		System.out.println(day / 1000 / 60 /60 / 24);
	}

}
