package com.zy.day5.set;

import java.util.HashSet;
import java.util.Set;

import com.zy.day5.bean.Person;

//��set������Զ������͵�����
public class HashSet02 {

	public static void main(String[] args) {

		Set<Person> set = new HashSet<>();
		set.add(new Person("����",44));
		set.add(new Person("������",44));
		set.add(new Person("������",44));
		set.add(new Person("�ŵ���",44));
		
		for (Person person : set) {
			System.out.println(person);
		}
	}

}
