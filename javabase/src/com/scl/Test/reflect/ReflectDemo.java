package com.scl.Test.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectDemo {

	public static void main(String[] args) {
	 try {
		 //获取整个类
		Class c = Class.forName("java.lang.String");
		//获取所有的属性
		
		Field[] fs = c.getDeclaredFields();
		//getDeclaredFields()加s是获取多个
		//定义可变长度的字符串，用来存储属性
		
		StringBuffer sb =new StringBuffer();
		//通过追加的方法，将每个属性拼接到此字符串中
		//最外边的public定义
		
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
		// 这里都是调用class类里的方法
		//getSimpleName()---返回源代码中给出的底层类的简称。
		for (Field field : fs) {
			
			//通过foreach遍历获取所有的属性
			sb.append("\t");//制表符
			
			sb.append(Modifier.toString(field.getModifiers())+" ");
			//这里是返回此类或接口以整数编码的 Java 语言修饰符。然后通过toString输出字符串
			
			sb.append(field.getType().getSimpleName()+" ");
			//这里是返回一个类型的名称
			//调用field方法里的getType()返回一个 Class 对象，它标识了此 Field 对象所表示字段的声明类型。
			
			sb.append(field.getName()+";\n");
			//以 String 的形式返回此 Class 对象所表示的实体（类、接口、数组类、基本类型或 void）名称。
		}
		sb.append("}");
		System.out.println(sb);
	
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	}

}
