package com.monkey1024.exercise;

import java.io.File;

/**
 * 问题：统计项目根目录下以.txt结尾的文件数量，并将文件名打印出来
 * 分析：获取项目根目录下的文件名
 *     对文件名进行判断是否是以.txt结尾
 */
public class FindTxt {

	public static void main(String[] args) {
		File file = new File("F:\\monkey1024\\01-JavaSE\\代码\\code\\chapter-08");
		File[] fileArray = file.listFiles();
		
		//统计出现次数
		int count = 0;
		for(File name : fileArray){
			String s = name.toString();
			
			//判断是否是以.txt文件结尾
			if(s.endsWith(".txt")){
				if(name.isFile()){
					count++;
					System.out.println(name);
				}
			}
		}
		
		System.out.println("以.txt文件结尾的数量是" + count + "个");
		
	}
	
	//会将根目录下以.txt结尾的文件夹也统计出来，严格来说不正确
	@Deprecated
	private static void method1() {
		File file = new File("F:\\monkey1024\\01-JavaSE\\代码\\code\\chapter-08");
		String[] nameArray = file.list();
		//统计出现的次数
		int count = 0;
		for(String name : nameArray){
			if(name.endsWith(".txt")){
				count++;
				System.out.println(name);
			}
		}
		
		System.out.println("以.txt文件结尾的数量是" + count + "个");
	}

}
