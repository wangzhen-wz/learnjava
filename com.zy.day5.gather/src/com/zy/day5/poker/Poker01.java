package com.zy.day5.poker;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ���⣺ʵ���˿˵�ϴ�ƺͷ��ƹ���
 * 
 * ������
 *    ��ʼ��һ���˿ˣ��ŵ�list����
 *    Collections�е�shuffle������list�е�����˳����д��ң�ʵ��ϴ�ƹ���
 *    ���Ʒַ���������ң�������Ҫ�������ŵ��ơ��ȴ�list��ȡ�������ƣ�֮��ʣ�µķָ��������
 * 
 */
public class Poker01 {

	public static void main(String[] args) {
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","k"};
		String[] color = {"����","����","��Ƭ","÷��"};
		
		ArrayList<String> poker = new ArrayList<>();
		
		//ѭ��ƴ���˿���
		for(String s1 : color){
			for(String s2 : num){
				poker.add(s1 + s2);
			}
		}
		
		poker.add("����");
		poker.add("С��");
		
		//ϴ��
		Collections.shuffle(poker);
		
		ArrayList<String> dipai = new ArrayList<>();
		//�����������
		ArrayList<String> pony = new ArrayList<>();
		ArrayList<String> robin = new ArrayList<>();
		ArrayList<String> jack = new ArrayList<>();
		
		//����
		// 0---pony
		// 1---robin
		// 2---jack
		// 3---pony
		// 4---robin
		// 5---jack
		//
		// pony:0,3,6,9 ��3�����0
		// robin:1,4,7,10 ��3�����1
		// jack:2,5,8,11 ��3�����2
		for(int i=0; i<poker.size(); i++){
			//��3�ŵ���
			if(i >= poker.size()-3){
				dipai.add(poker.get(i));
			}else if(i%3 == 0){
				pony.add(poker.get(i));
			}else if(i%3 == 1){
				robin.add(poker.get(i));
			}else{
				jack.add(poker.get(i));
			}
		}
		
		System.out.println("���ƣ�" + dipai);
		System.out.println("pony��" + pony);
		System.out.println("robin��" + robin);
		System.out.println("jack��" + jack);
	}

}
