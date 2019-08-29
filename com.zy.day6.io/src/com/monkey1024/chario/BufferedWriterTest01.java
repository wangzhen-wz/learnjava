package com.monkey1024.chario;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用BufferedWriter向文本文件中写出文字
 *
 */
public class BufferedWriterTest01 {

	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("newbuffered.txt"));) {
			bw.write("你好");
			bw.newLine();
			bw.write("java");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
