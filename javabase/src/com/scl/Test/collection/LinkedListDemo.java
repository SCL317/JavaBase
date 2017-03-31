package com.scl.Test.collection;

import java.util.Iterator;
import java.util.LinkedList;
/**
 * List  接口存储一组不唯一，有序（插入顺序）的对象
 * linkesList的特点是采用链表存储方式，插入删除元素时效率比较高。
 */
public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<>();
	list.add(12);
	list.add(22);
	list.add(32);
	list.add(42);
	list.add(66);
	list.add(23);
	list.add(23); //输出重复的内容

	System.out.println(list);
	
	Iterator<Integer> iterator = list.iterator();
	while (iterator.hasNext()) {
		Integer integer = (Integer) iterator.next();
	} System.out.println(list);
	
	for (Integer integer : list) {	
		
	}System.out.println(list);
	
	list.addLast(55);
	System.out.println("这里输出的list.addLast(55)后的list" +list);
	
	list.indexOf(23);  //这里表示在一个集合里找到某个成员的是后的位置
	list.lastIndexOf(23);  //这里表示在一个集合里最后找到这个成员时候的位置
	System.out.println("这里输出的list.indexOf(23)后的list  " +list.indexOf(23));
	System.out.println("这里输出的list.lastIndexOf(23)后的list  " +list.lastIndexOf(23));
	
	list.removeLast();  //这里是移除并返回列表中的最后一个
	System.out.println("这里输出的list.removeLast()后  " +list.removeLast());
	System.out.println("这里输出的list.removeLast()后的list" +list);
	
	list.addFirst(11);  //这里是在首位添加数据
	System.out.println("这里输出的list.addFirst(11)后的list" +list);
	
	
	
	}

}
