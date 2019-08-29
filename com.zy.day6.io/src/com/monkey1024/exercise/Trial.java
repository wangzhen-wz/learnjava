package com.monkey1024.exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 问题：收费版软件有试用次数，利用IO流的知识，模拟一个可以试用3次的功能，打开3次之后提示用户购买正版软件
 * 
 * 分析：将试用的次数做加密处理后写到txt文件中
 *     使用IO流相关的知识将txt文件中的内容读取到内存中
 *     如果读取的内容小于0时提示用户购买正版软件
 *     如果大于0小于等于3时，将试用次数做自减运算之后写出到txt文件中
 */
public class Trial {

	public static void main(String[] args) {
		//code();
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("src" + File.separator + "com"
					+ File.separator + "monkey1024" + File.separator + "exercise" + File.separator + "config.txt"));
			int temp = bis.read();
			//解密处理
			int count = temp ^ 66;
			if(count > 0 && count <= 3){
				count--;
				System.out.println("您的试用次数还剩余" + count + "次");
				bos = new BufferedOutputStream(new FileOutputStream("src" + File.separator + "com"
						+ File.separator + "monkey1024" + File.separator + "exercise" + File.separator + "config.txt"));
				//做加密处理
				bos.write(count ^ 66);
				bos.flush();
			}else{
				System.out.println("您的试用次数已超出限制，请购买正版软件!");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				//避免出现空指针
				if(bis != null){
					bis.close();
				}
				if(bos != null){
					bos.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//试用次数加密处理
	private static void code() {
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream("src" + File.separator + "com"
					+ File.separator + "monkey1024" + File.separator + "exercise" + File.separator + "config.txt"));
			//加密处理
			bos.write(3 ^ 66);
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				//避免出现空指针异常
				if(bos != null){
					bos.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


}
