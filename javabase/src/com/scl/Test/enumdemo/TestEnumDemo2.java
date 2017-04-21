package com.scl.Test.enumdemo;

import java.util.EnumMap;
import java.util.EnumSet;

public class TestEnumDemo2 {

	public static void main(String[] args) {
		//通过foreach遍历EnumDemo
		System.out.println("EnumDemo :" );
		for (EnumDemo enumDemo : EnumDemo.values()) {
			System.out.println(enumDemo.name()+"--"+enumDemo.ordinal());
		}
		
		System.out.println("\n"+"--------------"+"\n");//分隔
		//通过foreach遍历EnumDemo2
		System.out.println("EnumDemo2 :" );
		for (EnumDemo2 enumDemo2 : EnumDemo2.values()) {
			System.out.println(enumDemo2.getDesc()+"--"+enumDemo2.getIndex()+"--"+enumDemo2.name()+"--"+enumDemo2.ordinal());
		}
		
		System.out.println("\n"+"--------------"+"\n");//分隔
		
		EnumDemo2 enumDemo2 =EnumDemo2.FRIDAY;
		//这里能够这样使用是应为FRIDAY是被static修饰的具体可参考EnumDemo2源文件中的反编译结果。
		switch (enumDemo2) {
		case FRIDAY:
			System.out.println("FRIDAY"+"---"+enumDemo2.getDesc());
			break;
		case WEDNESDAY:
			System.out.println("WEDNESDAY"+"---"+enumDemo2.getDesc());
			break;
		default:
			break;
		}
		
		System.out.println("\n"+"--------------"+"\n");//分隔
		
		//枚举实现接口
		Behaviour behaviour =Color.RED;                                                                      
		//Behaviour behaviour2 =new Color("绿色", 2);
		//不能被实例化,因为枚举的构造函数是只能是私有private，所以这边的构造函数不能被new实例化调用
		behaviour.print();
		System.out.println(behaviour.getInfo());
		
		
		//EnumSet
		EnumSet<EnumDemo2> EunmDemo2Set = EnumSet.allOf(EnumDemo2.class);
		for (EnumDemo2 enumDemo22 : EunmDemo2Set) {
			System.out.println(enumDemo22);
		}
		
		EnumMap<EnumDemo2, String> EnumDemo2Map =new EnumMap(EnumDemo2.class);
		EnumDemo2Map.put(EnumDemo2.MONDAY, "一");
		EnumDemo2Map.put(EnumDemo2.THUSDAY, "一");
	}

}
