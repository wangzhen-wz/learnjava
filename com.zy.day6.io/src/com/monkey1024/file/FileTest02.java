package com.monkey1024.file;

import java.io.File;

/**
 * ʹ��File����������ɾ���ļ����ļ���
 *
 */
public class FileTest02 {

	public static void main(String[] args) {
		//������
//		File oldFile = new File("D:\\hello.txt");
//		//������
//		File newFile = new File("D:\\world.txt");
//		oldFile.renameTo(newFile);
		
		//������
		File oldFile1 = new File("D:\\world.txt");
		//������
		File newFile1 = new File("D:\\monkey\\java.txt");
		//��������ļ�·����һ�£���Ὣ���ļ����е��µ��ļ�·������������
		oldFile1.renameTo(newFile1);
		
		//���Ὣ�ļ��ŵ�����վ�У�����ֱ��ɾ��
//		File del = new File("D:\\monkey\\java.txt");
//		//ɾ��
//		System.out.println(del.delete());
		
		File del1 = new File("D:\\monkey");
		//����ļ������������ļ����򲻻�ɾ��
		System.out.println(del1.delete());
		
	}

}
