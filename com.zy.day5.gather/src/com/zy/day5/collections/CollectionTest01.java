package com.zy.day5.collections;

import java.util.ArrayList;
import java.util.Collections;

//collection�����ೣ�÷���
public class CollectionTest01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(523);
		list.add(51);
		list.add(588);
		list.add(50);
		System.out.println(list);
		//�����е����ֵ
		System.out.println(Collections.max(list));
		//�������е����ݷ�ת
		Collections.reverse(list);
		System.out.println(list);
		//�������е�����λ������û�������������ϴ��
		Collections.shuffle(list);
		System.out.println(list);
		
		//����
		Collections.sort(list);
		System.out.println(list);
		
		//���ַ�����
		Collections.binarySearch(list, 6);
		System.out.println(Collections.binarySearch(list, 588));
	}
}
