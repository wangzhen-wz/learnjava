package com.zy.day4.hotel;

import java.util.Scanner;

public class HoteTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("欢迎使用酒店管理系统");
		
		Hotel h = new Hotel();
		h.print();
		
		while (true) {
		
			System.out.println("请输入退房或预定:");
			String order = scan.next();
			if ("预定".equals(order)) {
				System.out.println("请输入房间号：");
				String id = scan.next();
				h.order(id);
			}else if ("退房".equals(order)) {
				System.out.println("请输入房间号：");
				String id = scan.next();
				h.checkout(id);
			}else {
				System.out.println("请输入房间号：");
			}
			h.print();
			
		}
	}
}
