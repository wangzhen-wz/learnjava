package com.zy.day4.array01;

public class SelectSort {

	public static void main(String[] args) {
		
		int[] a = {2,5,3,7,4};
		
		//�������鳤��-1�����������
		for (int i = 0; i < a.length-1; i++) {
			int min = i;//����iλ���ϵ�Ԫ������С��
			for (int j = i+1; j < a.length; j++) {
				if (a[min]>a[j]) {
					min = j;//��ȡ��Сֵ����������±�
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
