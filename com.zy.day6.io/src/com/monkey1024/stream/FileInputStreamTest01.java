package com.monkey1024.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream读取文件
 *
 */
public class FileInputStreamTest01 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			//绝对路径
			//fis = new FileInputStream("F:\\monkey1024\\01-JavaSE\\代码\\code\\chapter-08\\monkey.txt");
			//相对路径，系统会从项目的根目录开始读取
			fis = new FileInputStream("monkey.txt");
			/*//打印的字母的码值
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			//读取完毕之后返回-1
			System.out.println(fis.read());
			System.out.println(fis.read());*/
			
			//使用循环读取
			//效率不高，每次去硬盘读取一个字节
/*			int temp;
			while((temp = fis.read()) != -1){
				char c = (char)temp;
				System.out.println(c);
			}*/
			
			//定义byte数组告诉系统一次读取几个字节，减少内存和硬盘之间的通信，可以提高效率
			byte[] arr = new byte[3];
			int temp;
			//有参的read方法返回的int值是读取了几个字节
			while((temp = fis.read(arr)) != -1){
				System.out.println(new String(arr, 0, temp));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
