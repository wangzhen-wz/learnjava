package com.monkey1024.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ��Student���л���Ӳ����
 *
 */
public class ObjectOutput {

	public static void main(String[] args) {
		
		Student zhangsan = new Student();
		zhangsan.setName("����");
		zhangsan.setAge(20);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("zhangsan"));) {
			//����Ҫ���л��Ķ���
			oos.writeObject(zhangsan);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
