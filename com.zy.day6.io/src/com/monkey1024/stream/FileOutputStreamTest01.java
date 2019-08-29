package com.monkey1024.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 向文本文件中写出内容
 *
 */
public class FileOutputStreamTest01 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//如果该文件不存在，则会自动创建
			//传入true会在文件内容的后面写入文字，而不会覆盖之前的内容
			//开发中文件分隔符最好不要直接写\
			fos = new FileOutputStream("file" + File.separator + "1024.txt",true);
			String msg = "Hello World";
			//换行
			fos.write("\n".getBytes());
			fos.write(msg.getBytes());
			fos.write("\n".getBytes());
			fos.write("java".getBytes());
			//刷新，保证内存中的内容全部写入到硬盘的文件中
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
