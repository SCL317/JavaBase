package com.scl.Test.IO2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		try {
			FileOutputStream fos =new FileOutputStream("person.object");
			ObjectOutputStream oos =new ObjectOutputStream(fos);
			oos.writeObject(new Person(1,"jack","1234"));//匿名对象
			oos.writeObject(new Person(2,"Rose","5678"));
			oos.close();
			System.out.println("Success!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
