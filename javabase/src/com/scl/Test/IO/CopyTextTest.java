package com.scl.Test.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest {

	public static void main(String[] args) throws IOException {
		//copy一个文件我们首先需要想读取一个文件
		FileReader fr =new FileReader("copytext.txt"); 
		//然后我们需要创建一个目的地来存储读取到的数据
		FileWriter fw =new FileWriter("D:\\copytext2.txt");
		//这时候我们需要对这个文件进行读写的操作
		int  ch=0;
		while((ch=fr.read())!=-1){
			//这里是判断读取到的是否为-1如果为-1则结束
			fw.write(ch);
		}
		
		fw.close();//一定要关闭，关闭流资源
		fr.close();//一定要关闭
		

	}

}
