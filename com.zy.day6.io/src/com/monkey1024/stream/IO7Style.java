package com.monkey1024.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO��jdk7��д��
 * jdk7�¼���Ľӿ�AutoCloseable
 */
public class IO7Style {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("java.txt");
				FileOutputStream fos = new FileOutputStream("file" + File.separator + "good.txt");
				CloseTest ct = new CloseTest();
				) {

			byte[] arr = new byte[8];
			int temp;
			while ((temp = fis.read(arr)) != -1) {
				fos.write(arr, 0, temp);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

}

/**
 * �Զ�����ʵ��AutoCloseable�ӿ�
 *
 */
class CloseTest implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("�ѹر�");
	}
	
}
