package com.zy.day3.object01;



public class StudentsTest1 {

	public static void main(String[] args) {
		
		//������������ ������ = new ����������
		//������ֻҪ�ǺͺϷ��ı�ʶ��
		Students stu = new Students();
		//����ʹ�ö��������������ķ�ʽ���ʳ�Ա����
		stu.id = 1001;
		stu.name = "����";
		stu.nex = true;
		stu.age = 20;
		
		System.out.println(stu.id);
		System.out.println(stu.name);
		System.out.println(stu.nex ? '��' : 'Ů');
		System.out.println(stu.age);
		
		stu.study();
		stu.love("����");
		stu.takeExcrises("����");
	}
}
