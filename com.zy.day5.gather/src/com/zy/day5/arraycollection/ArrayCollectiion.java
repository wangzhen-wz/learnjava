package com.zy.day5.arraycollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCollectiion {

	public static void main(String[] args) {

		//����ת��Ϊ����
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		//�����������鳤��С�ڵ���list��sizeʱ��ϵͳ��Ĭ�ϵĽ����鳤���޸�Ϊ��list��sizeһ��
		//�����������鳤�ȴ���list��sizeʱ��ϵͳ�����޸�
		String[] s = list.toArray(new String[5]);
		System.out.println(s.length);
		
		//����ת���Ҽ���
		String[] arr = {"a","b","c"};
		List<String> arrayList = Arrays.asList(arr);
		arrayList.add("d");
		System.out.println(arrayList);
 	}

}
