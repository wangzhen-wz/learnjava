package com.zy.day4.array01;

public class MaxArray {

	public static void main(String[] args) {
		
		int[] arr = {4,6,7,23,35};
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			
		}
		System.out.println(max);
	}
}
