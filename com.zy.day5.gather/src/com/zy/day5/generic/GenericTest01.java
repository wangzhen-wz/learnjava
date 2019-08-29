package com.zy.day5.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.zy.day5.bean.Person;


public class GenericTest01 {

	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("monkey");
		list.add(1024);
		list.add(new Person("���»�",51));
		
		Iterator iter = list.iterator();
		
		//��Ϊ��list�����Ŷ������ݣ������ڽ��е���ʱҪ���ж�������ж�
		while (iter.hasNext()) {
			Object object = (Object) iter.next();
			if (object instanceof String) {
				String str = (String)object;
			}
			if (object instanceof Integer) {
				Integer i = (Integer) object;
			}
			if (object instanceof Person) {
				Person person = (Person)object;
			}
		}
		System.out.println(list);
	}
}
