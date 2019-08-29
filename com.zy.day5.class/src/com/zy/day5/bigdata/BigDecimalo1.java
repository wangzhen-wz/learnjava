package com.zy.day5.bigdata;

import java.math.BigDecimal;
import java.text.DecimalFormat;


//��ȷ����

public class BigDecimalo1 {


	public static void main(String[] args) {
		
		//������ȷ
		BigDecimal bd1 = new BigDecimal(2.0);
		BigDecimal bd2 = new BigDecimal(1.1);
		System.out.println(bd1.subtract(bd2));
		
		//�����н���������
		BigDecimal db3 = new BigDecimal("2.0");
		BigDecimal db4 = new BigDecimal("1.1");
		System.out.println(db3.subtract(db4));
		
		//������Ҳ��������ʹ��
		BigDecimal db5 =BigDecimal.valueOf(2.0);
		BigDecimal db6 = BigDecimal.valueOf(1.1);
		System.out.println(db5.subtract(db6));
		
		
		String  RMB = DecimalFormat.getCurrencyInstance().format(123456);
		System.out.println(RMB);
		
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println(df.format(123456));
		
		//����ǧ��λ������λС��
		DecimalFormat df2 = new DecimalFormat("###,###.##");
		System.out.println(df2.format(123456.123));
		
		
		//����ǧ��λ������λС��������0
		DecimalFormat df3 = new DecimalFormat("###,###.0000");
		System.out.println(df3.format(123456.123));
	}
}