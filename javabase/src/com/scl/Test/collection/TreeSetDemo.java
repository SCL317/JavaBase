package com.scl.Test.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> list = new TreeSet();
		list.add(11);
		list.add(21);
		list.add(51);
		list.add(61);
		list.add(81);
		list.add(41);
		list.add(11);// 元素唯一不能出现同样的字符

		System.out.println(list);
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

		list.ceiling(50); // 返回最少的元素在这组大于或等于给定的元素,或零如果没有这样的元素。
		System.out.println("这里输出的是list.ceiling(50)" + list.ceiling(50));
		System.out.println("这里输出的是list.ceiling(51)" + list.ceiling(51));

		list.descendingSet(); // 返回一个相反的顺序的元素包含在这个集合。
		System.out.println("这里输出的是list.descendingSet(1)" + list.descendingSet());
		

	}

}
