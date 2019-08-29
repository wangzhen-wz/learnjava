package com.zy.day5.enum01;

//Ã¶¾Ù

public class EnumTest01 {

	
	public enum Season{
		spring,summer,autumn,winter
	}
	
	public static void main(String[] args) {

		System.out.println(Season.spring);
		
		System.out.println(Constant.SPR_STRING);
		System.out.println(Constant.SUM_STRING);
		
	}
}
