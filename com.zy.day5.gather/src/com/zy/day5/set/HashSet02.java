package com.zy.day5.set;

import java.util.HashSet;
import java.util.Set;

import com.zy.day5.bean.Person;

//向set中添加自定义类型的数据
public class HashSet02 {

	public static void main(String[] args) {

		Set<Person> set = new HashSet<>();
		set.add(new Person("张三",44));
		set.add(new Person("的张三",44));
		set.add(new Person("张三的",44));
		set.add(new Person("张的三",44));
		
		for (Person person : set) {
			System.out.println(person);
		}
	}

}
