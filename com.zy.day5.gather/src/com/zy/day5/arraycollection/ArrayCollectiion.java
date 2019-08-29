package com.zy.day5.arraycollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCollectiion {

	public static void main(String[] args) {

		//集合转化为数组
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		//如果定义的数组长度小于等于list的size时，系统会默认的将数组长度修改为跟list的size一致
		//如果定义的数组长度大于list的size时，系统不会修改
		String[] s = list.toArray(new String[5]);
		System.out.println(s.length);
		
		//数组转换我集合
		String[] arr = {"a","b","c"};
		List<String> arrayList = Arrays.asList(arr);
		arrayList.add("d");
		System.out.println(arrayList);
 	}

}
