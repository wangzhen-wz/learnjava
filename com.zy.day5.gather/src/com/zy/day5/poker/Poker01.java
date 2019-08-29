package com.zy.day5.poker;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 问题：实现扑克的洗牌和发牌功能
 * 
 * 分析：
 *    初始化一副扑克，放到list里面
 *    Collections中的shuffle方法对list中的数据顺序进行打乱，实现洗牌功能
 *    将牌分发给三个玩家，另外需要留下三张底牌。先从list中取出三张牌，之后将剩下的分给三个玩家
 * 
 */
public class Poker01 {

	public static void main(String[] args) {
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","k"};
		String[] color = {"黑桃","红桃","方片","梅花"};
		
		ArrayList<String> poker = new ArrayList<>();
		
		//循环拼接扑克牌
		for(String s1 : color){
			for(String s2 : num){
				poker.add(s1 + s2);
			}
		}
		
		poker.add("大王");
		poker.add("小王");
		
		//洗牌
		Collections.shuffle(poker);
		
		ArrayList<String> dipai = new ArrayList<>();
		//创建三个玩家
		ArrayList<String> pony = new ArrayList<>();
		ArrayList<String> robin = new ArrayList<>();
		ArrayList<String> jack = new ArrayList<>();
		
		//发牌
		// 0---pony
		// 1---robin
		// 2---jack
		// 3---pony
		// 4---robin
		// 5---jack
		//
		// pony:0,3,6,9 对3求余得0
		// robin:1,4,7,10 对3求余得1
		// jack:2,5,8,11 对3求余得2
		for(int i=0; i<poker.size(); i++){
			//留3张底牌
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
		
		System.out.println("底牌：" + dipai);
		System.out.println("pony：" + pony);
		System.out.println("robin：" + robin);
		System.out.println("jack：" + jack);
	}

}
