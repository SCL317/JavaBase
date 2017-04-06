package com.scl.Test.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileCharacterStream {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("myInfo.txt");
			FileWriter fw = new FileWriter("myInfoBack.txt");
			int read = fr.read();
			while(read != -1){
				fw.write(read);
				read = fr.read();
			}
			fr.close();
			fw.close();
			System.out.println("Copy Success!");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
