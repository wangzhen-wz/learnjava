package com.monkey1024.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���ı��ļ���д������
 *
 */
public class FileOutputStreamTest01 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//������ļ������ڣ�����Զ�����
			//����true�����ļ����ݵĺ���д�����֣������Ḳ��֮ǰ������
			//�������ļ��ָ�����ò�Ҫֱ��д\
			fos = new FileOutputStream("file" + File.separator + "1024.txt",true);
			String msg = "Hello World";
			//����
			fos.write("\n".getBytes());
			fos.write(msg.getBytes());
			fos.write("\n".getBytes());
			fos.write("java".getBytes());
			//ˢ�£���֤�ڴ��е�����ȫ��д�뵽Ӳ�̵��ļ���
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
