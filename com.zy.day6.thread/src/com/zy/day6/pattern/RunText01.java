package com.zy.day6.pattern;

import java.io.IOException;

public class RunText01 {

	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();
		rt.exec("mspaint");
	}

}