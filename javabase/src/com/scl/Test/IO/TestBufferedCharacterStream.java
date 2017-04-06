package com.scl.Test.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedCharacterStream {

	public static void main(String[] args) {
		try{
			FileReader input = new FileReader("myInfo.txt");
			BufferedReader br = new BufferedReader(input);
			FileWriter output = new FileWriter("myInfoBack.txt");
			BufferedWriter bw =new BufferedWriter(output);
			String s =br.readLine();
			while (s!=null) {
				bw.write(s);
				bw.newLine();
				s=br.readLine();
			}
			br.close();
			bw.close();
			System.out.println("Copy Success!");	
		}catch (IOException e) {
		e.printStackTrace();
		}

	}

}
