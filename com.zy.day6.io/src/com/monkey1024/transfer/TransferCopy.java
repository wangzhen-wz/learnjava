package com.monkey1024.transfer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * 使用转换流解决操作不同编码的文本文件乱码问题 InputStreamReader OutputStreamWriter
 *
 */
public class TransferCopy {

	public static void main(String[] args) {
		try (
				// InputStreamReader isr = new InputStreamReader(new
				// FileInputStream("utf-8.txt"), "utf-8");
				// OutputStreamWriter osw = new OutputStreamWriter(new
				// FileOutputStream("gbk.txt"), "gbk");
				BufferedReader br = new BufferedReader(
						new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8"));
				BufferedWriter bw = new BufferedWriter(
						new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk"));) {
			String msg;
			while((msg = br.readLine()) != null){
				bw.write(msg);
			}
			
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
