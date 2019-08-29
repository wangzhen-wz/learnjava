package com.zy.day5.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection01 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		System.out.println(c.size());
		
		System.out.println(c);
		
		c.remove("b");
		System.out.println(c);
		
		//������ת��������Ȼ����б���
		Object[] o = c.toArray();
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}
		
		//��ռ���Ԫ��
		c.clear();
		System.out.println(c);
		
		
		System.out.println(c.contains("b"));
		
		System.out.println(c.isEmpty());
	}
}
