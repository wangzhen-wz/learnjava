package com.zy.day5.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * map简介
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
		//判断map照片那个是否存在key
		System.out.println(map.containsKey(1002));
//		判断，map中是否存在value
		System.out.println(map.containsValue("asdf"));
		//取得map的长度
		System.out.println(map.size());
		
		//取得map中的value
		Collection<String> c = map.values();
		System.out.println(c);
		
		String s3=map.remove(1003);
		System.out.println(s3);
		
		//清空map
		map.clear();
		System.out.println(s1);
		
	}

}
