package com.monkey1024.transfer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 将utf-8.txt中的内容读取并写出到gbk.txt文件中
 *
 */
public class ContentCopy {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("utf-8.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("gbk.txt"));) {
			String msg;
			while((msg = br.readLine()) != null){
				bw.write(msg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
