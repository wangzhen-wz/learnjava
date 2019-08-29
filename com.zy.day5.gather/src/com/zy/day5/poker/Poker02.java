package com.zy.day5.poker;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * ���⣺ʵ���˿˵�ϴ�ƺͷ��ƹ���,������ӡ�Ľ����������
 * 
 * ������
 *    ���˿��Ʒŵ�map��value���棬�ֶ���ʼ��������Ϊkey����������list��Ҳ���һ�ݡ�
 *    ��list����ϴ�Ʋ���
 *    ���Ʒַ���������ң���ΪҪ��������ʹ��TreeSet��
 *    ��TreeSet�е�Ԫ����Ϊkey��ȥmap���ҵ���Ӧ��value
 * 
 */
public class Poker02 {

	public static void main(String[] args) {
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","k"};
		String[] color = {"����","����","��Ƭ","÷��"};
		
		HashMap<Integer, String> pokerMap = new HashMap<>();
		ArrayList<Integer> indexList = new ArrayList<>();
		//����
		int index = 0;
		
		for(String s1 : num){
			for(String s2 : color){
				pokerMap.put(index, s2 + s1);
				indexList.add(index);
				//��������
				index++;
			}
		}
		
		pokerMap.put(index, "����");
		indexList.add(index++);
		pokerMap.put(index, "С��");
		indexList.add(index);
		
		//ϴ��
		Collections.shuffle(indexList);
		
		//����
		TreeSet<Integer> pony = new TreeSet<>();
		TreeSet<Integer> robin = new TreeSet<>();
		TreeSet<Integer> jack = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();
		
		for(int i=0; i<indexList.size(); i++){
			if(i >= indexList.size() - 3){
				dipai.add(indexList.get(i));
			}else if(i%3 == 0){
				pony.add(indexList.get(i));
			}else if(i%3 == 1){
				robin.add(indexList.get(i));
			}else {
				jack.add(indexList.get(i));
			}
		}
		
		check(pokerMap, pony, "pony");
		check(pokerMap, robin, "robin");
		check(pokerMap, jack, "jack");
		check(pokerMap, dipai, "dipai");
		
		
	}
	
	//�鿴ÿ��������е���
	private static void check(HashMap<Integer, String> pokerMap, TreeSet<Integer> ts, String name) {
		System.out.print(name + ":");
		for(Integer key : ts){
			System.out.print(pokerMap.get(key) + " ");
		}
		System.out.println();
	}

}
