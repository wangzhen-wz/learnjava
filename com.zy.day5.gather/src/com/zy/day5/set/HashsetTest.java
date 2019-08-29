package com.zy.day5.set;

import java.util.HashSet;
import java.util.Set;

//set的特点：元素不能重复吗没有索引，无序，存取顺序不一致

public class HashsetTest {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		boolean b1 = set.add("a");
		boolean b2 = set.add("a");
		System.out.println(set.size());
		System.out.println(b1);
		System.out.println(b2);
	}

}
