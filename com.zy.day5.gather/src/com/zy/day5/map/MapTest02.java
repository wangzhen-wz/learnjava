package com.zy.day5.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * map的遍历方式一
 * map遍历方式二
 */
public class MapTest02 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1001, "asdf");
		map.put(1002, "assdf");
		map.put(1003, "asxdf");
		map.put(1004, "asdcf");
		map.put(1005, "asdfv");
		
		/*
		 * map遍历方式一
		 * //将map中的key返回获取map中所有的key Set<Integer> krySet = map.keySet();
		 * 
		 * Iterator<Integer> iter = krySet.iterator();
		 * 
		 * //遍历获取到key之后即可获取相对应的value while (iter.hasNext()) { Integer integer =
		 * (Integer) iter.next(); System.out.println("键：" + integer + ",值" +
		 * map.get(integer)); }
		 * 
		 * //增强for循环 for (Integer integer : map.keySet()) { System.out.println("键：" +
		 * integer + ",值" + map.get(integer)); }
		 */
		
		
		//map遍历方式二
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> iter = entrySet.iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer ,String> entry = iter.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("键：" + key + ",值：" + value);
			}
		//增强for循环
		for (Map.Entry<Integer, String> entry2 : map.entrySet()) {
			System.out.println("键：" + entry2.getKey() + ",值：" + entry2.getValue());
		}
  	}
}
