package com.zy.day3.object01;



public class StudentsTest1 {

	public static void main(String[] args) {
		
		//创建对象：类名 对象名 = new 类名（）；
		//对象名只要是和合法的标识符
		Students stu = new Students();
		//可以使用对象名。变量名的方式访问成员变量
		stu.id = 1001;
		stu.name = "张三";
		stu.nex = true;
		stu.age = 20;
		
		System.out.println(stu.id);
		System.out.println(stu.name);
		System.out.println(stu.nex ? '男' : '女');
		System.out.println(stu.age);
		
		stu.study();
		stu.love("勤勤");
		stu.takeExcrises("篮球");
	}
}
