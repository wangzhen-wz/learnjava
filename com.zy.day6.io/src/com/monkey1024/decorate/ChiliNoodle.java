package com.monkey1024.decorate;

public class ChiliNoodle implements NoodleDecorate {
	
	//普通拉面
	private Noodle noodle;
	
	
	//传入要加辣椒的普通拉面对象
	public ChiliNoodle(Noodle noodle) {
		this.noodle = noodle;
	}

	/**
	 * 对普通拉面进行升级，加入辣椒
	 */
	@Override
	public void addThings() {
		noodle.addThings();
		System.out.println("加三勺辣椒酱");
	}

}
