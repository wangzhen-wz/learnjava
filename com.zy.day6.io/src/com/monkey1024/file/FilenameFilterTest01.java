package com.monkey1024.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 问题：统计项目根目录下以.txt结尾的文件数量，并将文件名打印出来
 * 使用文件过滤器实现上述需求
 */
public class FilenameFilterTest01 {

	public static void main(String[] args) {
		File file = new File("F:\\monkey1024\\01-JavaSE\\代码\\code\\chapter-08");
		String[] nameArray = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name){
				//获取根目录下每个文件的File对象
				File file1 = new File(dir, name);
				//编写筛选条件
				return file1.isFile() && file1.getName().endsWith(".txt");
			}
		});
		
		System.out.println("以.txt结尾的文件个数是" + nameArray.length + "个");
		
		for(String name : nameArray){
			System.out.println(name);
		}
	}

}
