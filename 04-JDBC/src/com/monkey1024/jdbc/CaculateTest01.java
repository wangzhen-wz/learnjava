package com.monkey1024.jdbc;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;


/**
 * junit
 *
 */
public class CaculateTest01 {
	
	/*
	 * 使用junit執行方法時
	 * 1.方法不能有返回值
	 * 2.方法不能有參數
	 * 
	 */
	@Test
	public void test1(){
		System.out.println("monkey1024");
	}
	
	@Test
	public void test2(){
		Caculate c = new Caculate();
		Assert.assertEquals(15, c.add(10, 5));
		TestCase.assertEquals(15, c.add(10, 5));
	}
	
	@Test
	public void test3(){
		Caculate c = new Caculate();
		Assert.assertEquals(3, c.devide(10, 3), 0.4);
	}
}
