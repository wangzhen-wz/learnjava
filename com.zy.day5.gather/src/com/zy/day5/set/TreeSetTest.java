package com.zy.day5.set;

import java.util.TreeSet;


public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(5);
		ts.add(8);
		ts.add(57);
		ts.add(55);
		ts.add(51);
		//TreeSet可以对存储元素进行排序
		System.out.println(ts);
	}
}
