package com.monkey1024.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 需求：使用缓冲流将java.txt文件复制到file文件夹夹里面，并且重命名为good.txt
 *
 */
public class BufferFileCopy {

	public static void main(String[] args) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			//缓冲输入流底层默认创建一个大小是8192长度的byte数组
			bis = new BufferedInputStream(new FileInputStream("java.txt"));
			bos = new BufferedOutputStream(new FileOutputStream("file" + File.separator + "good.txt"));
			
			int temp;
			while((temp = bis.read()) != -1){
				bos.write(temp);
			}
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
