package com.monkey1024.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream��ȡ�ļ�
 *
 */
public class FileInputStreamTest01 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			//����·��
			//fis = new FileInputStream("F:\\monkey1024\\01-JavaSE\\����\\code\\chapter-08\\monkey.txt");
			//���·����ϵͳ�����Ŀ�ĸ�Ŀ¼��ʼ��ȡ
			fis = new FileInputStream("monkey.txt");
			/*//��ӡ����ĸ����ֵ
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			//��ȡ���֮�󷵻�-1
			System.out.println(fis.read());
			System.out.println(fis.read());*/
			
			//ʹ��ѭ����ȡ
			//Ч�ʲ��ߣ�ÿ��ȥӲ�̶�ȡһ���ֽ�
/*			int temp;
			while((temp = fis.read()) != -1){
				char c = (char)temp;
				System.out.println(c);
			}*/
			
			//����byte�������ϵͳһ�ζ�ȡ�����ֽڣ������ڴ��Ӳ��֮���ͨ�ţ��������Ч��
			byte[] arr = new byte[3];
			int temp;
			//�вε�read�������ص�intֵ�Ƕ�ȡ�˼����ֽ�
			while((temp = fis.read(arr)) != -1){
				System.out.println(new String(arr, 0, temp));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
