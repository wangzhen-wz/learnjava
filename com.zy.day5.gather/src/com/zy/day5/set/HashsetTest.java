package com.zy.day5.set;

import java.util.HashSet;
import java.util.Set;

//set���ص㣺Ԫ�ز����ظ���û�����������򣬴�ȡ˳��һ��

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
