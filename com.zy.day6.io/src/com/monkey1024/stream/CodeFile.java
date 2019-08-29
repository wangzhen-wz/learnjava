package com.monkey1024.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件加密
 *
 */
public class CodeFile {

	public static void main(String[] args) {
		//jdk7新写法
		try (
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream("自定义数组缓冲.png"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("code.png"));
				) {
			
			int temp;
			while((temp = bis.read()) != -1){
				bos.write(temp ^ 88);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
