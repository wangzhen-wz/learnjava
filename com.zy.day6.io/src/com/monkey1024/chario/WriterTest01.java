package com.monkey1024.chario;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ʹ��FileWriter���ı��ļ���д������
 *
 */
public class WriterTest01 {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("word.txt");) {
			fw.write("��ϲ��ѧϰjava");
			fw.write(97);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
