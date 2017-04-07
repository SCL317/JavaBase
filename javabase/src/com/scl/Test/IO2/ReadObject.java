package com.scl.Test.IO2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		try {
			FileInputStream fis =new FileInputStream("person.object");
			ObjectInputStream ois =new ObjectInputStream(fis);
			Person person1 =(Person)ois.readObject();
			/*这边需要转型成Person 因为readObject的读取到的是Object的类型
			的需要向下转型成Person类型的才能显示出来*/
			Person person2 =(Person)ois.readObject();
			
			System.out.println(person1);
			System.out.println(person2);
			ois.close();
			
		} catch (Exception e) {
			
		}

	}

}
