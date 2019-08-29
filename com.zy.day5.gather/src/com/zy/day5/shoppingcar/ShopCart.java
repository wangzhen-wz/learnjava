package com.zy.day5.shoppingcar;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ���ﳵ��
 *
 */
public class ShopCart {
	
	//���������Ʒ��Ϣ������
	Map<Product, Integer> productMap;
	
	BigDecimal totalPrice = BigDecimal.valueOf(0.0);
	
	public ShopCart(){
		productMap = new HashMap<>();
	}
	
	//���ﳵ�������Ʒ������
	public void add(Product product, int num){
		//�ж�map���Ƿ������ǰ��Ʒ�������������ֱ�ӽ���Ʒ��������ӵ�map����
		if(!productMap.containsKey(product)){
			productMap.put(product, num);
		}else{
			//��������ߵ����˵��֮ǰ�Ѿ����ﳵ����ӹ���ǰ��Ʒ����Ҫ�����������������
			int before = productMap.get(product);//ȡ��֮ǰ���ﳵ�е���Ʒ����
			int after = before + num;
			productMap.put(product, after);
		}
		
		//�ܼ� = ��Ʒ���� * ����
		totalPrice = totalPrice.add(product.getPrice().multiply(BigDecimal.valueOf(num)));
	}
	
	//�ӹ��ﳵ��ɾ����Ʒ������
	public void remove(Product product, int num){
		//��ȡ���ﳵ�е���Ʒ����
		int before = productMap.get(product);
		if(num >= before){
			//������Ʒ�ӹ��ﳵ��ɾ��
			productMap.remove(product);
			totalPrice = totalPrice.subtract(product.getPrice().multiply(BigDecimal.valueOf(before)));
		}else{
			//ʣ�����Ʒ����
			int after = before - num;
			productMap.put(product, after);
			totalPrice = totalPrice.subtract(product.getPrice().multiply(BigDecimal.valueOf(num)));
		}
		
		
	}
	
	//��չ��ﳵ
	public void clear(){
		productMap.clear();
		totalPrice = BigDecimal.valueOf(0.0);
	}
	
	//��ӡ�굥
	public void print(){
		System.out.println("��Ʒ�嵥:");
		
		Set<Product> key = productMap.keySet();
		Iterator<Product> iter = key.iterator();
		
		while(iter.hasNext()){
			Product p = iter.next();
			Integer i = productMap.get(p);
			System.out.println(i + "�� 	" + p + "\t" + p.getPrice().multiply(BigDecimal.valueOf(i)));
		}
		
		System.out.println("\t\t\t\t\t�ܼۣ�" + totalPrice);
	}
}
