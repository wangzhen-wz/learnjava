package com.monkey1024.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 向文本文件中写出中文
 *
 */
public class WordWrite {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("java.txt", true);) {
			fos.write("\n".getBytes());
			String msg = "好好学习";
			//一个汉字占2个字节，向里面一次传入3个字节会导致乱码
			fos.write(msg.getBytes(), 0, 3);
			fos.write("\n".getBytes());
			fos.write("天天向上".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
