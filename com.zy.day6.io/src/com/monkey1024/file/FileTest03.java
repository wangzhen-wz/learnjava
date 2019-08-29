package com.monkey1024.file;

import java.io.File;

/**
 * File类中的常用判断方法
 *
 */
public class FileTest03 {

	public static void main(String[] args) {
		File file1 = new File("D:\\monkey");
		//判断是否是文件夹
		System.out.println(file1.isDirectory());
		//判断是否是文件
		System.out.println(file1.isFile());
		
		File file2 = new File("D:\\new.txt");
		//判断是否是文件夹
		System.out.println(file2.isDirectory());
		//判断是否是文件
		System.out.println(file2.isFile());
		
		//判断文件是否存在
		System.out.println(file2.exists());
		
		File file3 = new File("D:\\hidden");
		//判断文件是否隐藏
		System.out.println(file3.isHidden());
	}

}
