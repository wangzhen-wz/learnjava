package com.monkey1024.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���ı��ļ���д������
 *
 */
public class WordWrite {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("java.txt", true);) {
			fos.write("\n".getBytes());
			String msg = "�ú�ѧϰ";
			//һ������ռ2���ֽڣ�������һ�δ���3���ֽڻᵼ������
			fos.write(msg.getBytes(), 0, 3);
			fos.write("\n".getBytes());
			fos.write("��������".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
