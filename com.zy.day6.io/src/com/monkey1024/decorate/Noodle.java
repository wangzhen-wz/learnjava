package com.monkey1024.decorate;

public class Noodle implements NoodleDecorate{
	
	/**
	 * 制作一碗普通的拉面
	 */
	@Override
	public void addThings() {
		System.out.println("加一块肉末");
		System.out.println("加两片白萝卜");
		System.out.println("加三根香菜");
	}

}
