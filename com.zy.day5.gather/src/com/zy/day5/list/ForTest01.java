package com.zy.day5.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ForTest01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("d");
		list.add("c");
		list.add("b");
		
		//ʹ��forѭ������,��ô��ǿ��Լ򻯱���
		for (String str : list) {
			System.out.println(str);
		}
		
		//ʹ����ͨforѭ��������ɾ����ע���������Լ�����
		for (int i = 0; i < list.size(); i++) {
			if ("b".equals(list.get(i))) {
				list.remove(i);
				i--;
			}
		}
		
		//������������ɾ�������Ǳ���ѽʹ�õ����������remove�������������ֲ����޸��쳣
		for (ListIterator<String> iterator = list.listIterator(); iterator.hasNext();) {
			if ("b".equals(iterator.next())) {
				iterator.remove();
			}	
		}
		
		//��ǿforѭ������ɾ��
		for (String string : list) {
			if ("b".equals(string)) {
				list.remove(string);
			}
		}
		System.out.println(list);
	}
}
