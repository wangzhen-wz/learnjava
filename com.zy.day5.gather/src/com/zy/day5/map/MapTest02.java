package com.zy.day5.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * map�ı�����ʽһ
 * map������ʽ��
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
		 * map������ʽһ
		 * //��map�е�key���ػ�ȡmap�����е�key Set<Integer> krySet = map.keySet();
		 * 
		 * Iterator<Integer> iter = krySet.iterator();
		 * 
		 * //������ȡ��key֮�󼴿ɻ�ȡ���Ӧ��value while (iter.hasNext()) { Integer integer =
		 * (Integer) iter.next(); System.out.println("����" + integer + ",ֵ" +
		 * map.get(integer)); }
		 * 
		 * //��ǿforѭ�� for (Integer integer : map.keySet()) { System.out.println("����" +
		 * integer + ",ֵ" + map.get(integer)); }
		 */
		
		
		//map������ʽ��
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> iter = entrySet.iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer ,String> entry = iter.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("����" + key + ",ֵ��" + value);
			}
		//��ǿforѭ��
		for (Map.Entry<Integer, String> entry2 : map.entrySet()) {
			System.out.println("����" + entry2.getKey() + ",ֵ��" + entry2.getValue());
		}
  	}
}
