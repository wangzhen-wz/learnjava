package com.monkey1024.exercise;

import java.io.File;

/**
 * ���⣺ͳ����Ŀ��Ŀ¼����.txt��β���ļ������������ļ�����ӡ����
 * ��������ȡ��Ŀ��Ŀ¼�µ��ļ���
 *     ���ļ��������ж��Ƿ�����.txt��β
 */
public class FindTxt {

	public static void main(String[] args) {
		File file = new File("F:\\monkey1024\\01-JavaSE\\����\\code\\chapter-08");
		File[] fileArray = file.listFiles();
		
		//ͳ�Ƴ��ִ���
		int count = 0;
		for(File name : fileArray){
			String s = name.toString();
			
			//�ж��Ƿ�����.txt�ļ���β
			if(s.endsWith(".txt")){
				if(name.isFile()){
					count++;
					System.out.println(name);
				}
			}
		}
		
		System.out.println("��.txt�ļ���β��������" + count + "��");
		
	}
	
	//�Ὣ��Ŀ¼����.txt��β���ļ���Ҳͳ�Ƴ������ϸ���˵����ȷ
	@Deprecated
	private static void method1() {
		File file = new File("F:\\monkey1024\\01-JavaSE\\����\\code\\chapter-08");
		String[] nameArray = file.list();
		//ͳ�Ƴ��ֵĴ���
		int count = 0;
		for(String name : nameArray){
			if(name.endsWith(".txt")){
				count++;
				System.out.println(name);
			}
		}
		
		System.out.println("��.txt�ļ���β��������" + count + "��");
	}

}
