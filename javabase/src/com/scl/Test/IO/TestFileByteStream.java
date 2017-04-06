package com.scl.Test.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestFileByteStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis =new FileInputStream("sun.jpg");
			FileOutputStream fos = new FileOutputStream("sunback.jpg");
			
			int read =fis.read();
			while (read !=-1) {
				fos.write(read);
				read=fis.read();
			} 
			fis.close();
			fos.close();
			System.out.println("Copy Success!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
