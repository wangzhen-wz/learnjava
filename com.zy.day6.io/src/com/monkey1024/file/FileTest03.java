package com.monkey1024.file;

import java.io.File;

/**
 * File���еĳ����жϷ���
 *
 */
public class FileTest03 {

	public static void main(String[] args) {
		File file1 = new File("D:\\monkey");
		//�ж��Ƿ����ļ���
		System.out.println(file1.isDirectory());
		//�ж��Ƿ����ļ�
		System.out.println(file1.isFile());
		
		File file2 = new File("D:\\new.txt");
		//�ж��Ƿ����ļ���
		System.out.println(file2.isDirectory());
		//�ж��Ƿ����ļ�
		System.out.println(file2.isFile());
		
		//�ж��ļ��Ƿ����
		System.out.println(file2.exists());
		
		File file3 = new File("D:\\hidden");
		//�ж��ļ��Ƿ�����
		System.out.println(file3.isHidden());
	}

}
