package com.zy.day3.polymorphic;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.eat();
		
		Animal animal = new Cat();//父类引用指向子类对象，自动类型转换，向上转型
		
		animal.eat();//动态绑定和静态绑定
		
		System.out.println(animal.num);//成员变量不存在重写
		
		((Cat) animal).move();//强制类型转换，向下转型
		
		Animal animal2 = new Animal();
		if (animal2 instanceof Cat) {//类型转换时转型钱判断instanceof
			Cat cat2 = (Cat) animal2;
		}else {
			System.out.println("animal2不是Cat类型");
		}
 	}

}
