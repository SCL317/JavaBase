package com.scl.Test.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
	 demo_writer();
	 demo_reader();
	}

	private static void demo_reader() throws IOException {
		FileInputStream fr =new FileInputStream("byteDemoTest.txt");
		/*//这里一次只能读取一个字节
		int ch =fr.read();
		System.out.println(ch);*/
		
		/*int ch=0;
		while ((ch=fr.read())!=-1) {
			System.out.println((char)ch);
		}
		*/
		
		
		byte[] bt = new byte[4096];
		int len =0;
		while ((len=fr.read(bt))!=-1) {
			//使用new String(bt, 0, bt.length)将byte数组转化为字符串
			System.out.println(new String(bt, 0, len));
		}
		

		fr.close();
		
	}

	private static void demo_writer() throws IOException {
		
		//创建一个字节输出流的对象
		FileOutputStream fw =new FileOutputStream("byteDemoTest.txt"); 
		/*getBytes(): 使用平台的默认字符集将字符串编码为 byte 序列，
		并将结果存储到一个新的 byte 数组中。*/
		fw.write("asdasdasd".getBytes());
		
		fw.close();
		
	}

}
