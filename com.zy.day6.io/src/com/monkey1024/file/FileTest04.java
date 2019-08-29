package com.monkey1024.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File�����������÷���
 *
 */
public class FileTest04 {

	public static void main(String[] args) {
		File file1 = new File("1024.txt");
		//�鿴����·��
		System.out.println(file1.getAbsolutePath());
		//�ļ��Ĵ�С����λ���ֽ�
		System.out.println(file1.length());
		//����޸�ʱ��
		Date date = new Date(file1.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		
		File file2 = new File("F:\\monkey1024\\01-JavaSE\\����\\code\\chapter-08");
		//��ȡĿ¼�µ�ͬ���ļ����ļ��е�����
		String[] nameArray = file2.list();
		for(String name : nameArray){
			System.out.println(name);
		}
		
		//��ȡĿ¼�µ�ͬ���ļ����ļ��е�File����
		File[] fileArray = file2.listFiles();
		//��ӡ���ļ��ľ���·��
		for(File file : fileArray){
			System.out.println(file);
		}
	}

}
