package com.monkey1024.chario;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用FileWriter向文本文件中写出中文
 *
 */
public class WriterTest01 {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("word.txt");) {
			fw.write("我喜欢学习java");
			fw.write(97);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
