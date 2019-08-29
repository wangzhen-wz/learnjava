package com.zy.day4.array01;

public class SelectSort {

	public static void main(String[] args) {
		
		int[] a = {2,5,3,7,4};
		
		//遍历数组长度-1即可完成排序
		for (int i = 0; i < a.length-1; i++) {
			int min = i;//假设i位置上的元素是最小的
			for (int j = i+1; j < a.length; j++) {
				if (a[min]>a[j]) {
					min = j;//获取最小值所在数组的下标
				}
			}
			if (min != i) {
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
	}
}
