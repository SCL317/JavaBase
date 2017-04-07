package com.scl.Test.TDemo;

import java.awt.DisplayMode;
import java.util.ArrayList;

public class TestGenerics1 {

	public static void main(String[] args) {
		ArrayList<String> list1 =new ArrayList<String>();
		list1.add("Jack");
		list1.add("Rose");
		display(list1);
		
		ArrayList<Integer> list2 =new ArrayList<Integer>();
		list2.add(11);
		list2.add(22);
		display(list2);
		/*1.如果这里我们调用的类方法display（）里面的集合类型是String类型
		在这里display(list2)会报错，因为这个是ArrayList<Integer>
	    2.如果这里我们调用的类方法display（）里面的集合类型是泛型
	          则没有问题
	    3.
	     */
	}
    /*public static void display(ArrayList<String> list){
    	for (String string : list) {
			System.out.println(string);
		}
    }
           这里我们是将类方法display（）里的集合指定为String类型
    */
	
	
	/*public static <T> void display(ArrayList<T> list){
    	for (T  t: list) {
			System.out.println(t);
		}
    }
	//这里我们是将类方法display（）里的集合类型指定为指定为泛型
*/	
	public static void display(ArrayList<?> list){
    	for (Object oj : list) {
			System.out.println(oj);
		}
    }//这里我们用到的是通配符
}
