package com.monkey1024.exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���⣺�շѰ���������ô���������IO����֪ʶ��ģ��һ����������3�εĹ��ܣ���3��֮����ʾ�û������������
 * 
 * �����������õĴ��������ܴ����д��txt�ļ���
 *     ʹ��IO����ص�֪ʶ��txt�ļ��е����ݶ�ȡ���ڴ���
 *     �����ȡ������С��0ʱ��ʾ�û������������
 *     �������0С�ڵ���3ʱ�������ô������Լ�����֮��д����txt�ļ���
 */
public class Trial {

	public static void main(String[] args) {
		//code();
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("src" + File.separator + "com"
					+ File.separator + "monkey1024" + File.separator + "exercise" + File.separator + "config.txt"));
			int temp = bis.read();
			//���ܴ���
			int count = temp ^ 66;
			if(count > 0 && count <= 3){
				count--;
				System.out.println("�������ô�����ʣ��" + count + "��");
				bos = new BufferedOutputStream(new FileOutputStream("src" + File.separator + "com"
						+ File.separator + "monkey1024" + File.separator + "exercise" + File.separator + "config.txt"));
				//�����ܴ���
				bos.write(count ^ 66);
				bos.flush();
			}else{
				System.out.println("�������ô����ѳ������ƣ��빺���������!");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				//������ֿ�ָ��
				if(bis != null){
					bis.close();
				}
				if(bos != null){
					bos.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//���ô������ܴ���
	private static void code() {
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream("src" + File.separator + "com"
					+ File.separator + "monkey1024" + File.separator + "exercise" + File.separator + "config.txt"));
			//���ܴ���
			bos.write(3 ^ 66);
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				//������ֿ�ָ���쳣
				if(bos != null){
					bos.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


}
