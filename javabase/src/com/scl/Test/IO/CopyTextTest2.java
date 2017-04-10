package com.scl.Test.IO;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyTextTest2 {

	public static void main(String[] args) {
		
		FileReader fr =null;
		FileWriter fw =null;
		
		try {
			fr =new FileReader("copytext.txt");
			fw =new FileWriter("D:\\copytext3.txt");
			
			char[] ch = new char[3];
		} catch (Exception e) {
			// TODO: handle exception
		}		
		

	}

}
