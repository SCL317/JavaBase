package com.scl.Test.collection;

/**
 * 实现了长度可变的数组在内存中分配连续的空间
 * 遍历元素和随机元素的效率比较高。
 */

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDome {

	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("这");
	list.add("是");
	list.add("JAVA");
	list.add("的");
	list.add("集");
	list.add("合");
	list.add("框");
	list.add("架");
	list.add("架"); //可以重复输入
	
	for (String string : list) {	
	}System.out.println("这里通过foreach输出遍历的合集：" +list);
	
	//list.size(); 
	System.out.println("list.size =" +list.size());
	
	//list.get(2);
	System.out.println("list.get(2) =" +list.get(2));
	
	list.add("!");//这里是添加了一个
	//这是通过迭代器Iterator进行遍历集合
	Iterator<String> iterator = list.iterator();
	while (iterator.hasNext()) {
		String string = (String) iterator.next();
		System.out.println(string);
	}
	
	//list.isEmpty();  判断集合是否为空
	System.out.println("list.isEmpty() =" +list.isEmpty());
	
	//list.set(1, "是（1）"); 这个是替换指定位置上的数据；
	System.out.println("list.set(1, 是（1）) =" +list.set(1, "是（1）"));
	System.out.println("list.set(1, 是（1）)后的list " +list);
	
	list.remove(1); //这里是remove移除了指定的数据 原有的集合会改变
	System.out.println("这里输出的list.remove(1)后的结果=" +list.remove(1));
	System.out.println("这里输出的list.remove(1)后的list" +list);
	
	list.get(1);  //返回了标记的数据  
	System.out.println("这里输出的list.get(1)后的结果=" +list.get(1));
	System.out.println("这里输出的list.get(1)后的list" +list);
	
    list.contains("集");  //这是检查集合中是否存在某个变量
    list.contains("哈");  
	System.out.println("这里是检查集合里存在“集”： " +list.contains("集"));
	System.out.println("这里是检查集合里存在“哈”： " +list.contains("哈"));
	
	list.add(7, "改");
	System.out.println("这里是add后： " +list);
	
	list.subList(1, 5);//这里是输出一个区段
	System.out.println("这里是list.subList(1, 5)后： " +list.subList(1, 5));
	
	Collections.sort(list);
	System.out.println("这里是排序后： " +list);
	
	/*list.indexOf("稳");
	list.indexOf("合");*/
	System.out.println("这里是list.indexOf后： " +list.indexOf("稳"));
	System.out.println("这里是list.indexOf后： " +list.indexOf("改"));
	System.out.println("这里是list.indexOf后： " +list);
	
	list.lastIndexOf("合");
	System.out.println("这里是list.lastindexOf后： " +list.lastIndexOf("架"));
	
	list.clear();  //这是直接清除所有了
	System.out.println("这里是clear后： " +list);
	
	}

}
