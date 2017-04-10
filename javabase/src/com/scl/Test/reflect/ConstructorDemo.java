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

		Constructor<?> con[] = c.getConstructors();
		try {
			person1 = (Person) con[4].newInstance();
			person2 = (Person) con[3].newInstance("小明");
			person3 = (Person) con[2].newInstance(20);
			person4 = (Person) con[1].newInstance(false);
			person5 = (Person) con[0].newInstance("阿萨德", 22, false);

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
