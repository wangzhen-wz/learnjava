package com.zy.day3.inherit;

public class Animal {

	public String name = "animal";
	
	String color;
	String category;
	
	public Animal() {
	
		System.out.println("Animal�е��޲ι��췽��");
	}
	public Animal(String color,String category) {
		this.color=color;
		this.category = category;
	}
	
	
	public void eat() {
		System.out.println("animal eat!");
	}
}
