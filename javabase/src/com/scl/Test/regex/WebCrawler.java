package com.scl.Test.regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {

	public static void main(String[] args) throws IOException {
		List<String> list = getmails();
		for (String string : list) {
			System.out.println(string);
		}
		
		getmailsline();
	}
	

	private static void getmailsline() throws IOException {
	 URL url =new URL("https://www.baidu.com/s?wd=%40qq.com&rsv_spt=1&rsv_iqid=0xe670d19400003d63&issp=1&f=8&rsv_bp=1&rsv_idx=2&ie=utf-8&rqlang=cn&tn=baiduhome_pg&rsv_enter=1&oq=%25E9%2582%25AE%25E7%25AE%25B1&rsv_t=0fdbdPw9cf%2BYth72236kOPeoEuMF%2FpjKx5UDz47KPIlNVvwgg6e%2FYfdxRKVK0aW7%2BMI4&rsv_pq=9dc44ada00004373&rsv_sug3=17&rsv_sug1=10&rsv_sug7=100&rsv_sug2=0&inputT=2970327&rsv_sug4=2970332");
		
	}


	public static List<String> getmails() throws IOException {
		//演示的的为爬取本地已有文件里的信息
		//先读取到需要爬的文件
		BufferedReader br = new BufferedReader(new FileReader("D:\\GITHUB\\123.html"));
		//定义已有的规则
		String regex = "[0-9a-zA-Z_]+@[0-9a-zA-Z]+\\.[a-z]{2,3}";
		
		List<String> list =new ArrayList<String>();
		
		Pattern p = Pattern.compile(regex);
		
		String line = null;
		
		while ((line = br.readLine())!= null) {
			Matcher m = p.matcher(line);
			while (m.find()) {
				list.add(m.group());
			}
		}
		return list;
	}

}
