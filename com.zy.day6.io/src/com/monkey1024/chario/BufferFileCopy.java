package com.monkey1024.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ʹ�û����������ļ�
 * ע�⣺�ַ������ܶ�ȡ���ı��ļ�
 */
public class BufferFileCopy {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("java.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("file" + File.separator + "hellojava.txt"));	
				) {
			
			String msg;
			while((msg = br.readLine()) != null){
				bw.write(msg);
				bw.newLine();
			}
			
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
