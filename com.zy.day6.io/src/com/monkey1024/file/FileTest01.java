package com.monkey1024.file;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File�ഴ���ļ����ļ���
 *
 */
public class FileTest01 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("D:\\hello.txt");
		//����ļ����ڣ��Ͳ������ˣ�����false����������ھͻᴴ��������true
		System.out.println(file1.createNewFile());
		
		File file2 = new File("D:\\new");
		//����ļ��д��ڣ��Ͳ������ˣ�����false����������ھͻᴴ��������true
		System.out.println(file2.mkdir());
		
		File file3 = new File("D:\\monkey\\1024");
		//���Դ����༶Ŀ¼������ļ��д��ڣ��Ͳ������ˣ�����false����������ھͻᴴ��������true
		System.out.println(file3.mkdirs());
		
		File file4 = new File("D:\\monkey\\1024.txt");
		//ֻ�ܴ����ļ���
		System.out.println(file4.mkdirs());
		
		File file5 = new File("1026.txt");
		//�����д�̷�����Ĭ������Ŀ�ĸ�Ŀ¼���洴��
		System.out.println(file5.createNewFile());
		System.out.println(file5.exists());
	}

}
