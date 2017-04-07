package com.scl.Test.TDemo;

public class TestPerson {

	public static void main(String[] args) {
		Person<String> person1=new Person<String>();
		person1.setName("Jack");
		person1.setPass("123456");
		String info1=person1.getName()+":"+person1.getPass();
        System.out.println(info1);
        
        Person<Integer> person2=new Person<Integer>();
		person2.setName("Jack");
		person2.setPass(123456);
		String info2=person2.getName()+":"+person2.getPass();
        System.out.println(info2);
	}

}
