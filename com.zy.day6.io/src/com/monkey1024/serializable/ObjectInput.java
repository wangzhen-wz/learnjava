package com.monkey1024.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ʹ�÷����л���Ӳ���ϵ�zhangsan��ȡ���ڴ���
 *
 */
public class ObjectInput {

	public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("zhangsan"));) {
			//����ȡ�Ķ���ǿ��ת��ΪStudent����
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
