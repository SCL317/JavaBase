package com.scl.Test.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.sound.sampled.Line;

public class BufferedWriterDemo {
    //这种换行的方法使用的范围更广
	//private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		FileWriter fw =new FileWriter("bf.txt");
		
		
		//为了提高字符流的写入效率，使用了字符流的缓冲区
		//创建一个字符写入流的缓冲区对象，并指定要被要被缓冲的流对象相关联
		BufferedWriter bw =new BufferedWriter(fw);
		
		//使用缓冲区的写入方法将数据写入到缓冲区中
		//bw.write("这个是buffered的演示"+LINE_SEPARATOR+"hahahha");
		bw.write("这个是buffered的演示");
		bw.newLine();// 写入一个行分隔符。buffered里的方法
		bw.write("这是通过调用BufferedWriter里面的方法换行");
		
		//这里是刷新缓冲区将数据刷入目的地中
		bw.flush();
		
		//这里关闭缓冲区，这个其实关闭的就是被缓冲的流对象
		bw.close();
		fw.close();

	}

}
