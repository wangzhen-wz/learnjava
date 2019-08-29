package com.monkey1024.file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File类创建文件和文件夹
 *
 */
public class FileTest01 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("D:\\hello.txt");
		//如果文件存在，就不创建了，返回false，如果不存在就会创建，返回true
		System.out.println(file1.createNewFile());
		
		File file2 = new File("D:\\new");
		//如果文件夹存在，就不创建了，返回false，如果不存在就会创建，返回true
		System.out.println(file2.mkdir());
		
		File file3 = new File("D:\\monkey\\1024");
		//可以创建多级目录，如果文件夹存在，就不创建了，返回false，如果不存在就会创建，返回true
		System.out.println(file3.mkdirs());
		
		File file4 = new File("D:\\monkey\\1024.txt");
		//只能创建文件夹
		System.out.println(file4.mkdirs());
		
		File file5 = new File("1026.txt");
		//如果不写盘符，会默认在项目的根目录里面创建
		System.out.println(file5.createNewFile());
		System.out.println(file5.exists());
	}

}
