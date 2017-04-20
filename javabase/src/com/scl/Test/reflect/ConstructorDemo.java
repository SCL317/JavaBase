package com.scl.Test.reflect;

import java.lang.reflect.Constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("com.scl.Test.reflect.Person");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Person person1 = null;
		Person person2 = null;
		Person person3 = null;
		Person person4 = null;
		Person person5 = null;

		Constructor<?> con[] = c.getConstructors();//取得此类的所有的构造方法。
		//可以通过看getConstructors查看源代码 就晓得为什么了说
		/*返回一个包含某些Constructor对象的数组，这些对象反映此Class对象所表示的类的所有公共构造方法。
		如果该类没有公共构造方法，或者该类是一个数组类，或者该类反映一个基本类型或void，则返回一个长度为0的数组。
		若此对象包含很多个有参构造方法，返回的第一个也就是数组下标值是0的那个构造方法就是带参数最多的那个。*/
		try {
			person1 = (Person) con[4].newInstance();
			person2 = (Person) con[3].newInstance("小明");
			person3 = (Person) con[2].newInstance(20);
			person4 = (Person) con[1].newInstance(false);
			person5 = (Person) con[0].newInstance("阿萨德", 22, false);
			//因为实例化后得到是一个object类型的对象，要向下转型

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
		System.out.println(person5);
	}

}
