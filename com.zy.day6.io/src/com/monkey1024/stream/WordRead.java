package com.monkey1024.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 从文本文件中读取中文
 *
 */
public class WordRead {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("java.txt");) {
			byte[] arr = new byte[3];
			int temp;
			while((temp = fis.read(arr)) != -1){
				System.out.println(new String(arr, 0, temp));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
