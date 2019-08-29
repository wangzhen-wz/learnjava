package com.monkey1024.decorate;

/**
 * ¿≠√Ê≤‚ ‘¿‡
 *
 */
public class NoodleTest {

	public static void main(String[] args) {
		//Noodle noodle = new Noodle();
		//noodle.addThings();
		ChiliNoodle cn = new ChiliNoodle(new Noodle());
		cn.addThings();
	}

}
