package com.zy.day3.polymorphic;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.eat();
		
		Animal animal = new Cat();//��������ָ����������Զ�����ת��������ת��
		
		animal.eat();//��̬�󶨺;�̬��
		
		System.out.println(animal.num);//��Ա������������д
		
		((Cat) animal).move();//ǿ������ת��������ת��
		
		Animal animal2 = new Animal();
		if (animal2 instanceof Cat) {//����ת��ʱת��Ǯ�ж�instanceof
			Cat cat2 = (Cat) animal2;
		}else {
			System.out.println("animal2����Cat����");
		}
 	}

}
