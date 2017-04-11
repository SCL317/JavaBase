package com.scl.Test.Annotation;

import com.scl.Test.Annotation.myAnnotation;

public class Person {
	@myAnnotation(value="张三")
	private String name = "Jack";
	private int age = 35;
	private char sex = '男';
	
	public Person(){}
	
	public Person(String name) {
		this.name = name;
	}

	public Person(int age) {
		this.age = age;
	}
	
	public Person(char sex) {
		
		this.sex = sex;
	}

	public Person(String str,int i, char flag){
		name = str;
		age = i;
		sex = flag;
	} 
	
	public void display(){
		 System.out.println(name+" "+age+" "+sex);
	}
	
	public void display(String str,int i, char flag){
		name = str;
		age = i;
		sex = flag;
		 System.out.println(name+" "+age+" "+sex);
	}


	public static void main(String[] args) {
		Person person = new Person("Rose",20,'男');
		person.display();

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

}
