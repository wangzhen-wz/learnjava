package com.zy.day5.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ForTest01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("d");
		list.add("c");
		list.add("b");
		
		//使用for循环遍历,其好处是可以简化遍历
		for (String str : list) {
			System.out.println(str);
		}
		
		//使用普通for循环，可以删除，注意让索引自减运算
		for (int i = 0; i < list.size(); i++) {
			if ("b".equals(list.get(i))) {
				list.remove(i);
				i--;
			}
		}
		
		//迭代器，可以删除，但是必须呀使用迭代器自身的remove方法，否则会出现并发修改异常
		for (ListIterator<String> iterator = list.listIterator(); iterator.hasNext();) {
			if ("b".equals(iterator.next())) {
				iterator.remove();
			}	
		}
		
		//增强for循环不能删除
		for (String string : list) {
			if ("b".equals(string)) {
				list.remove(string);
			}
		}
		System.out.println(list);
	}
}
