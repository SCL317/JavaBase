package com.scl.Test.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class TestCharArray {

	public static void main(String[] args) throws IOException {
		char[] charArray = { 'H', 'e', 'l', 'l', 'O', ' ', 'W', 'o', 'r', 'l', 'd', '!' };
		CharArrayReader cr = new CharArrayReader(charArray);
		BufferedReader br = new BufferedReader(cr);

		/*
		 * 这里我们需要一个BufferedReader所以在这里我们需要满
		 *  足BufferedReader的条件public BufferedReader(Reader in)所以
		 *  这里我们通过new一个Reader或者Reader的子孙类（这里我们通过charArrayReader） 
		 *  来实现通过调用这个来满足我们BufferedReader(Reader in)的使用条件。
		 */

		CharArrayWriter cw = new CharArrayWriter();
		BufferedWriter bw = new BufferedWriter(cw);

		bw.write(br.readLine());
		// bw.flush();//这个和close（）一样不可缺失二者其一就可以了这里表示清空 而不是刷新
		bw.close(); // 在这里不可缺失
		System.out.println(cw);
	}

}
