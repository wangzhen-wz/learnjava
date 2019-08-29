package com.monkey1024.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 将Student序列化到硬盘中
 *
 */
public class ObjectOutput {

	public static void main(String[] args) {
		
		Student zhangsan = new Student();
		zhangsan.setName("张三");
		zhangsan.setAge(20);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("zhangsan"));) {
			//传入要序列化的对象
			oos.writeObject(zhangsan);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
