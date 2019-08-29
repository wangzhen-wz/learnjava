package com.monkey1024.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ļ�����
 *
 */
public class CodeFile {

	public static void main(String[] args) {
		//jdk7��д��
		try (
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream("�Զ������黺��.png"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("code.png"));
				) {
			
			int temp;
			while((temp = bis.read()) != -1){
				bos.write(temp ^ 88);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
