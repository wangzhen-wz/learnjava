package com.monkey1024.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File类中其他常用方法
 *
 */
public class FileTest04 {

	public static void main(String[] args) {
		File file1 = new File("1024.txt");
		//查看绝对路径
		System.out.println(file1.getAbsolutePath());
		//文件的大小，单位是字节
		System.out.println(file1.length());
		//最后修改时间
		Date date = new Date(file1.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		
		File file2 = new File("F:\\monkey1024\\01-JavaSE\\代码\\code\\chapter-08");
		//获取目录下的同级文件或文件夹的名称
		String[] nameArray = file2.list();
		for(String name : nameArray){
			System.out.println(name);
		}
		
		//获取目录下的同级文件或文件夹的File对象
		File[] fileArray = file2.listFiles();
		//打印出文件的绝对路径
		for(File file : fileArray){
			System.out.println(file);
		}
	}

}
