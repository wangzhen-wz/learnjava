package com.zy.day4.hotel;

import java.util.Scanner;

public class HoteTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("��ӭʹ�þƵ����ϵͳ");
		
		Hotel h = new Hotel();
		h.print();
		
		while (true) {
		
			System.out.println("�������˷���Ԥ��:");
			String order = scan.next();
			if ("Ԥ��".equals(order)) {
				System.out.println("�����뷿��ţ�");
				String id = scan.next();
				h.order(id);
			}else if ("�˷�".equals(order)) {
				System.out.println("�����뷿��ţ�");
				String id = scan.next();
				h.checkout(id);
			}else {
				System.out.println("�����뷿��ţ�");
			}
			h.print();
			
		}
	}
}
