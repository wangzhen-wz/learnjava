package com.zy.day5.generic;

import java.util.ArrayList;
import java.util.List;

import com.zy.day5.bean.Person;
import com.zy.day5.bean.Students;

public class GenericTest03 {

	public static void main(String[] args) {

		//�Ⱥ���ߵ���һ�������������������һ��list���͵����ݣ�����ȷ��list������ʲô���͵�����
		List<?> list = new ArrayList<>();
		
		List<Person> p = new ArrayList<>();
		p.add(new Person("����",28));
		p.add(new Person("����",28));
		p.add(new Person("����",28));
		
		List<Students> stu = new ArrayList<>();
		stu.add(new Students("����",26));
		
		p.addAll(stu);
		System.out.println(p);
	}

}
