package com.monkey1024.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 使用反序列化将硬盘上的zhangsan读取到内存中
 *
 */
public class ObjectInput {

	public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("zhangsan"));) {
			//将读取的对象强制转换为Student类型
			Student s = (Student)ois.readObject();
			System.out.println(s.getName());
			System.out.println(s.getAge());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
