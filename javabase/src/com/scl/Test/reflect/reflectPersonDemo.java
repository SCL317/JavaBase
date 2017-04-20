package com.scl.Test.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflectPersonDemo {

	public static void main(String[] args) throws Exception {

		/*
		 * Person person =new Person(); System.out.println(person);
		 */

		// 先获取一个类
		Class c = Class.forName("com.scl.Test.reflect.Person");
		// com.scl.Test.reflect.Person这个可以通过找到Person类文件
		// 然后通过选中Person这个类明右击Copy Qualified Name进行直接拷贝路径

		// 获取这类里的属性
		Field fld = c.getDeclaredField("age");
		// 这里是获取这个类里的方法
		Method mod = c.getMethod("display");// 这里调用的是无参的方法
		Method mod2 = c.getMethod("display", String.class, int.class, boolean.class);
		// 这里调用的是有参的方法

		// 实例化这个类
		Object o = c.newInstance();// 调用的无参构造函数
		//Person person = (Person) c.newInstance();
		
		
		// 打破封装/使用反射机制可以打破封装性，导致了java对象的属性不安全。
		fld.setAccessible(true);

		/*
		 * 通过这个方式给对象o进行赋值 set(Object obj, Object value) 将指定对象变量上此 Field
		 * 对象表示的字段设置为指定的新值。
		 */
		fld.set(o, 40);

		/*
		 * invoke(Object obj, Object... args) 对带有指定参数的指定对象调用由此 Method 对象表示的底层方法。
		 */
		mod.invoke(o);
		mod2.invoke(o, "zhangsan", 22, true);

		/*
		 * get(Object obj) 返回指定对象上此 Field 表示的字段的值。
		 */
		System.out.println(fld.get(o));

	}

}
