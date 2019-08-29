package com.zy.day5.bigdata;

import java.math.BigDecimal;
import java.text.DecimalFormat;


//精确开发

public class BigDecimalo1 {


	public static void main(String[] args) {
		
		//不够精确
		BigDecimal bd1 = new BigDecimal(2.0);
		BigDecimal bd2 = new BigDecimal(1.1);
		System.out.println(bd1.subtract(bd2));
		
		//开发中建议这样用
		BigDecimal db3 = new BigDecimal("2.0");
		BigDecimal db4 = new BigDecimal("1.1");
		System.out.println(db3.subtract(db4));
		
		//开发中也可以这样使用
		BigDecimal db5 =BigDecimal.valueOf(2.0);
		BigDecimal db6 = BigDecimal.valueOf(1.1);
		System.out.println(db5.subtract(db6));
		
		
		String  RMB = DecimalFormat.getCurrencyInstance().format(123456);
		System.out.println(RMB);
		
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println(df.format(123456));
		
		//加入千分位保留两位小数
		DecimalFormat df2 = new DecimalFormat("###,###.##");
		System.out.println(df2.format(123456.123));
		
		
		//加入千分位保留四位小数不够则补0
		DecimalFormat df3 = new DecimalFormat("###,###.0000");
		System.out.println(df3.format(123456.123));
	}
}