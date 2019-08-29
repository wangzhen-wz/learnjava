package com.zy.day5.generic;

import java.util.ArrayList;
import java.util.List;

import com.zy.day5.bean.Person;
import com.zy.day5.bean.Students;

public class GenericTest03 {

	public static void main(String[] args) {

		//等号左边调用一个方法，这个方法返回一个list类型的数据，但不确定list里面存放什么类型的数据
		List<?> list = new ArrayList<>();
		
		List<Person> p = new ArrayList<>();
		p.add(new Person("张三",28));
		p.add(new Person("李四",28));
		p.add(new Person("王五",28));
		
		List<Students> stu = new ArrayList<>();
		stu.add(new Students("王二",26));
		
		p.addAll(stu);
		System.out.println(p);
	}

}
