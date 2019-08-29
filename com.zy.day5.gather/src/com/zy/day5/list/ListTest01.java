package com.zy.day5.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {

		ListClass();
		
//		l.add(10, "e");//java.lang.IndexOutOfBoundsException集合中没有第十个元素
//		System.out.println(l);
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void ListClass() {
		List l = new ArrayList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		System.out.println(l);
		
		l.add(1, "e");
		System.out.println(l);
	}

}
