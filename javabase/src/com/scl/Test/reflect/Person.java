package com.scl.Test.reflect;

import com.scl.Test.Annotation.myAnnotation;

public class Person {
	private String name = "Jack";
	private int age = 35;
	private boolean married = true;
	
	public Person(){}
	
	public Person(String name) {
		this.name = name;
	}

	public Person(int age) {
		this.age = age;
	}
	
	public Person(boolean married) {
		
		this.married = married;
	}

	public Person(String str,int i, boolean flag){
		name = str;
		age = i;
		married = flag;
	} 
	
	public void display(){
		 System.out.println(name+" "+age+" "+married);
	}
	
	public void display(String str,int i, boolean flag){
		name = str;
		age = i;
		married = flag;
		 System.out.println(name+" "+age+" "+married);
	}


	public static void main(String[] args) {
		Person person = new Person("Rose",20,false);
		person.display();

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", married=" + married + "]";
	}

}
