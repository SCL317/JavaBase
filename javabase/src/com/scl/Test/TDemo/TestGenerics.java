package com.scl.Test.TDemo;

import java.util.HashMap;

import javax.print.DocFlavor.STRING;

public class TestGenerics {

	public static void main(String[] args) {
		HashMap<Integer, String> persons =new HashMap<Integer, String>();
        persons.put(1, "Jack");
        persons.put(2, "Rose");
        persons.put(3, "Mike");
        String name3 = persons.get(1);
        System.out.println("The No.3 is : " +name3);
	}

}
