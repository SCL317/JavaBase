package com.scl.Test.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) throws IOException {
		//这边声明异常是因为  可能会出现找不到文件
		FileWriter fw =new FileWriter("IOtest.txt");
		//FileReader fr =new FileReader("fw");
		fw.write("abcdefg");//这里是往fw文件里写入数据；
		fw.flush();
	}
}
