package com.zy.day5.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * map���
 * 
 */
public class MapTest01 {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		String s1 = map.put(1001, "asdf");
		map.put(1002, "assdf");
		map.put(1003, "asxdf");
		map.put(1004, "asdcf");
		map.put(1005, "asdfv");
		String s2 = map.put(1001, "asdfg");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(map.get(1001));
		//�ж�map��Ƭ�Ǹ��Ƿ����key
		System.out.println(map.containsKey(1002));
//		�жϣ�map���Ƿ����value
		System.out.println(map.containsValue("asdf"));
		//ȡ��map�ĳ���
		System.out.println(map.size());
		
		//ȡ��map�е�value
		Collection<String> c = map.values();
		System.out.println(c);
		
		String s3=map.remove(1003);
		System.out.println(s3);
		
		//���map
		map.clear();
		System.out.println(s1);
		
	}

}
