package com.monkey1024.exercise;

import java.io.File;
import java.util.Scanner;

/**
 * ���⣺�Ӽ��̽���һ��·���������·���µ������ļ����ļ��е����ְ��ղ㼶��ӡ��
 * ���磺
 *    monkey1024
 *              java
 *              	XXX.java
 *              	XXX.jpg
 *              php
 *              	XXX.php
 *              readme.txt
 * 
 * ��������ȡ·��File�����е�File����
 *     �������飬ȡ��File����
 *     ��ӡ�ļ����ļ��е�����
 *     �����һ���ļ��еĻ���ʹ�õݹ��ظ�����Ĳ���
 */
public class FileNames {
	
	//������¼�����Ĵ���
	private static int count = 0;

	public static void main(String[] args) {
		
		File file = getFile();
		
		getFileNames(file);
	}
	
	//ÿ�ε��ø÷���ʱ��˵�����뵽һ���µ��ļ��е��ڲ�����Ҫ����һ������
	private static void getFileNames(File file) {
		//��ȡ·��File�����е�File����
		File[] fileArray = file.listFiles();
		
		//�������飬ȡ��File����
		for(int i=0; i<fileArray.length; i++){
			
			//ͨ������count�����ƴ�ӡ��������
			for(int j=0; j<count; j++){
				System.out.print("\t");
			}
			
			//��ӡ�ļ����ļ��е�����
			System.out.println(fileArray[i]);
			
			//������������һ��File����ʱ��˵����ǰ�ļ����Ѿ�������������Ҫ���Լ�����
			if(i == fileArray.length-1){
				count--;
			}
			
			//�����һ���ļ��еĻ���ʹ�õݹ��ظ�����Ĳ���
			if(fileArray[i].isDirectory()){
				count++;
				getFileNames(fileArray[i]);
			}
			
		}
	}
	
	//��ȡ�û�����·����File����
	private static File getFile() {
		
		System.out.println("������һ���ļ���·����");
		
		Scanner sc = new Scanner(System.in);
		//��ȡ�û������·�����û������·���п����Ǵ���ģ���Ҫ�����ж�
		while(true){
			String input = sc.nextLine();
			File file = new File(input);
			if(!file.exists()){
				System.out.println("��������ļ�·�����������������ļ�·����");
			}else if(file.isFile()){
				//����û������·����һ���ļ�
				System.out.println("�������·����һ���ļ���������һ���ļ��е�·��");
			}else{
				return file;
			}
		}
	}
	
	

}
