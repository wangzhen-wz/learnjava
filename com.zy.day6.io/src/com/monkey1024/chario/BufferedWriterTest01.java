package com.monkey1024.chario;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ʹ��BufferedWriter���ı��ļ���д������
 *
 */
public class BufferedWriterTest01 {

	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("newbuffered.txt"));) {
			bw.write("���");
			bw.newLine();
			bw.write("java");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
