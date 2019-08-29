package com.monkey1024.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����ʹ�û�������java.txt�ļ����Ƶ�file�ļ��м����棬����������Ϊgood.txt
 *
 */
public class BufferFileCopy {

	public static void main(String[] args) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			//�����������ײ�Ĭ�ϴ���һ����С��8192���ȵ�byte����
			bis = new BufferedInputStream(new FileInputStream("java.txt"));
			bos = new BufferedOutputStream(new FileOutputStream("file" + File.separator + "good.txt"));
			
			int temp;
			while((temp = bis.read()) != -1){
				bos.write(temp);
			}
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
