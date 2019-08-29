package com.monkey1024.chario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ʹ��BufferedReader��ȡ�ı��ļ�
 *
 */
public class BufferedReaderTest01 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("word.txt"));) {
			String msg;
			while((msg = br.readLine()) != null){
				System.out.println(msg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
