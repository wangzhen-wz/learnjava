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
		list.add(new Person("刘德华",51));
		
		Iterator iter = list.iterator();
		
		//因为在list里面存放多种数据，所以在进行迭代时要进行多次类型判断
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
