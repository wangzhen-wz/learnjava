package com.monkey1024.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ���⣺ͳ����Ŀ��Ŀ¼����.txt��β���ļ������������ļ�����ӡ����
 * ʹ���ļ�������ʵ����������
 */
public class FilenameFilterTest01 {

	public static void main(String[] args) {
		File file = new File("F:\\monkey1024\\01-JavaSE\\����\\code\\chapter-08");
		String[] nameArray = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name){
				//��ȡ��Ŀ¼��ÿ���ļ���File����
				File file1 = new File(dir, name);
				//��дɸѡ����
				return file1.isFile() && file1.getName().endsWith(".txt");
			}
		});
		
		System.out.println("��.txt��β���ļ�������" + nameArray.length + "��");
		
		for(String name : nameArray){
			System.out.println(name);
		}
	}

}
