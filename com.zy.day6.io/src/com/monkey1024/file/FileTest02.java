package com.monkey1024.file;

import java.io.File;

/**
 * 使用File类重命名和删除文件或文件夹
 *
 */
public class FileTest02 {

	public static void main(String[] args) {
		//旧名字
//		File oldFile = new File("D:\\hello.txt");
//		//新名字
//		File newFile = new File("D:\\world.txt");
//		oldFile.renameTo(newFile);
		
		//旧名字
		File oldFile1 = new File("D:\\world.txt");
		//新名字
		File newFile1 = new File("D:\\monkey\\java.txt");
		//如果两个文件路径不一致，则会将旧文件剪切到新的文件路径中再重命名
		oldFile1.renameTo(newFile1);
		
		//不会将文件放到回收站中，而是直接删除
//		File del = new File("D:\\monkey\\java.txt");
//		//删除
//		System.out.println(del.delete());
		
		File del1 = new File("D:\\monkey");
		//如果文件夹下有其他文件，则不会删除
		System.out.println(del1.delete());
		
	}

}
