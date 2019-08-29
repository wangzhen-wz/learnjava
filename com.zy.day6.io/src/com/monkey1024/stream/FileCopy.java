package com.monkey1024.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 需求：将java.txt文件复制到file文件夹夹里面，并且重命名为good.txt
 *
 */
public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("java.txt");
			fos = new FileOutputStream("file" + File.separator + "good.txt");
			
			byte[] arr = new byte[6];
			int temp;
			while((temp = fis.read(arr)) != -1){
				fos.write(arr, 0, temp);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
