package com.zy.day5.collections;

import java.util.ArrayList;
import java.util.Collections;

//collection工具类常用方法
public class CollectionTest01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(523);
		list.add(51);
		list.add(588);
		list.add(50);
		System.out.println(list);
		//集合中的最大值
		System.out.println(Collections.max(list));
		//将集合中的数据翻转
		Collections.reverse(list);
		System.out.println(list);
		//将集合中的数据位置随机置换，可以用它来洗牌
		Collections.shuffle(list);
		System.out.println(list);
		
		//排序
		Collections.sort(list);
		System.out.println(list);
		
		//二分法查找
		Collections.binarySearch(list, 6);
		System.out.println(Collections.binarySearch(list, 588));
	}
}
