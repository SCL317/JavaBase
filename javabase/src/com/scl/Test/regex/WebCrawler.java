package com.scl.Test.regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {

	public static void main(String[] args) throws IOException {
		System.out.println("这里输出的是本地连接里的的邮箱");
		List<String> list = getmails();
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("--------------------------------------------------");
		System.out.println("这里输出的是爬虫网络上的邮箱");
		List<String> list1 = getmailsline();
		for (String string : list1) {
			System.out.println(string);
		}
	}

	private static List<String> getmailsline() throws IOException {

		URL url = new URL("http://tieba.baidu.com/p/2314539885");

		BufferedReader bReader = new BufferedReader(new InputStreamReader(url.openStream()));

		String regex = "[0-9a-zA-Z_]+@[0-9a-zA-Z]+\\.[a-z]{2,3}";

		List<String> list = new ArrayList<String>();

		Pattern p = Pattern.compile(regex);

		String line = null;

		while ((line = bReader.readLine()) != null) {
			Matcher m = p.matcher(line);
			while (m.find()) {	
				list.add(m.group());
			}
		}
		return list; 
	}

	public static List<String> getmails() throws IOException {
		// 演示的的为爬取本地已有文件里的信息
		// 先读取到需要爬的文件
		BufferedReader br = new BufferedReader(new FileReader("D:\\GITHUB\\123.html"));
		// 定义的规则
		String regex = "[0-9a-zA-Z_]+@[0-9a-zA-Z]+\\.[a-z]{2,3}";
        //通过这个
		List<String> list = new ArrayList<String>();

		Pattern p = Pattern.compile(regex);

		String line = null;

		while ((line = br.readLine()) != null) {
			Matcher m = p.matcher(line);
			while (m.find()) {
				list.add(m.group());
			}
		}
		return list;
	}

}
