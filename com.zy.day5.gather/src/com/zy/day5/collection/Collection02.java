package com.zy.day5.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.zy.day5.bean.Person;

public class Collection02 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Collection coll = new ArrayList<>();
		coll.add(new Person("张三",19));
		coll.add(new Person("李四",19));
		coll.add(new Person("王二",19));
		coll.add(new Person("麻子",19));
		System.out.println(coll.size());
		
		Object[]  object = coll.toArray();
		for (int i = 0; i < object.length; i++) {
		
			System.out.println(object[i]);
		}
		System.out.println(coll);
		
		Person p = new Person("张三",19);
		System.out.println(coll.contains(p));
	}

}
