package com.zy.day5.poker;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * 问题：实现扑克的洗牌和发牌功能,并将打印的结果进行排序
 * 
 * 分析：
 *    将扑克牌放到map的value里面，手动初始化索引作为key，将索引在list中也存放一份。
 *    将list进行洗牌操作
 *    将牌分发给三个玩家（因为要排序所以使用TreeSet）
 *    将TreeSet中的元素作为key，去map中找到相应的value
 * 
 */
public class Poker02 {

	public static void main(String[] args) {
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","k"};
		String[] color = {"黑桃","红桃","方片","梅花"};
		
		HashMap<Integer, String> pokerMap = new HashMap<>();
		ArrayList<Integer> indexList = new ArrayList<>();
		//索引
		int index = 0;
		
		for(String s1 : num){
			for(String s2 : color){
				pokerMap.put(index, s2 + s1);
				indexList.add(index);
				//索引自增
				index++;
			}
		}
		
		pokerMap.put(index, "大王");
		indexList.add(index++);
		pokerMap.put(index, "小王");
		indexList.add(index);
		
		//洗牌
		Collections.shuffle(indexList);
		
		//发牌
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
	
	//查看每个玩家手中的牌
	private static void check(HashMap<Integer, String> pokerMap, TreeSet<Integer> ts, String name) {
		System.out.print(name + ":");
		for(Integer key : ts){
			System.out.print(pokerMap.get(key) + " ");
		}
		System.out.println();
	}

}
