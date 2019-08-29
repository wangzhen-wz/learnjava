package com.zy.day6.pattern;

/**
 * 单例模式：保证软件在运行时，某个类在内存中只有一个对象
 *
 */
public class SingletonTest01 {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
	}

}

//懒汉式，单例的延迟加载
class Singleton{
	//1.构造方法私有化
	private Singleton(){
		
	}
	
	//2.创建当前类的引用，使用volatile修饰
	private volatile static Singleton s = null;
	
	//3.对外提供公共的同步的访问方法，将对象暴露给外部
	public synchronized static Singleton getInstance(){
		if(s == null){
			s = new Singleton();
		}
		
		return s;
	}
}

//饿汉式
/*class Singleton{
	
	//1.构造方法私有化
	private Singleton(){
		
	}
	
	//2.创建当前类的对象
	private static Singleton s = new Singleton();
	
	//3.创建公共方法，将对象暴露给外部
	public static Singleton getInstance(){
		return s;
	}
}*/