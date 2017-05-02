package com.scl.Test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {

		testMatches();  
		testMatches1();
		testMatches2();
		testMatches3();
	}

	private static void testMatches3() {
		// 获取一段文字中3个字母的单词
		System.out.println("这里是通过Pattern来获取");
		String stringDemo = "Even as US Vice-President Mike Pence reiterated the era of is over";
		
		// String regex = "[a-z]{3}";//这样写会吧所以只要有3或者大于3个字母的都给识别了 这样的方法是错误的
		String regex = "\\b[a-z]{3}\\b"; // 通过\\b来指定单词的边界。
		
		Pattern p = Pattern.compile(regex);
		// 将正则表达式进行对象的封装
		
		Matcher matcher = p.matcher(stringDemo);
		// 通过正则对象的matcher方法和字符串相关联，获取对字符串操作的匹配对象
		
		while (matcher.find()) {
			// boolean find() 尝试查找与该模式匹配的输入序列的下一个子序列。
			System.out.println(matcher.group());
			// group(int group) 返回在以前匹配操作期间由给定组捕获的输入子序列。
		System.out.println(matcher.start()+"位"+matcher.end()+"位");
		}
	}

	private static void testMatches2() {
		// 替换 关键字replaceAll
		System.out.println("这是演示正则表达式中的替换：");
		String st = "zhangsanmmmmmjintianqqqqqqqzai@@@@@@@@gan1111111shengme";
		st = st.replaceAll("(.)\\1+", "*");
		//replaceAll(String replacement)  替换模式与给定替换字符串相匹配的输入序列的每个子序列。
		System.out.println(st);

		String st2 = "zhangsanmmmmmjintianqqqqqqqzai@@@@@@@@gan1111111shengme";
		// 这里的$1表示引用组1(.)
		st2 = st2.replaceFirst("(.)\\1+", "$1");//replaceFirst 替换首次匹配,replaceAll 替换所有匹配。
		//st2 = st2.replaceAll("(.)\\1+", "$1");
		System.out.println(st2);
		String st3 = "15100001111"; // 正常我们看到的是这样的151****1111
		/*
		 * String string3 = st3.replaceAll("(1[1-9]{2})(\\d)\\2+(\\d)\\3+",
		 * "$1****$3"); 这种写法错误在(\\d)\\2+这种的没有划定范围只要能匹配上组(\\d)就一直匹配
		 */
		st3 = st3.replaceAll("(\\d{3})(\\d{4})(\\d{4})", "$1****$3");
		System.out.println(st3);
	}

	private static void testMatches1() {
		// 切割 关键字split
		System.out.println("这是切割一个空格的情况：");
		String str = "zhangsan jintian zai gan shengme";
		String[] s = str.split(" ");
		for (String string : s) {
			System.out.println(string);
		}

		System.out.println("这是切割中间多个空格的情况：");
		String str1 = "zhangsan     jintian    zai   gan    shengme";
		String[] s1 = str1.split(" +");
		//split()  围绕此模式的匹配拆分给定输入序列。
		for (String string1 : s1) {
			System.out.println(string1);
		}

		System.out.println("这是切割中间多个相同字符的情况：");
		String str2 = "zhangsanmmmmmjintianqqqqqqqzai@@@@@@@@gan1111111shengme";
		// 这里的的（）表示封装的一个组 \\1表示使用组1 +表示一个或多个
		String[] s2 = str2.split("(.)\\1+");
		for (String string2 : s2) {
			System.out.println(string2);
		}

	}

	private static void testMatches() {

		// 匹配的方法测试手机号码是否正确 关键字matches
		String tel = "15100001111";
		String tel1 = "15100qw1111";
		// String regex = "1\\d{10}";
		String regex = "1[0-9]{10}";
		boolean b = tel.matches(regex);
		boolean b1 = tel1.matches(regex);
		System.out.println("tel:" + tel + " " + b);
		System.out.println("tel1:" + tel1 + " " + b1);

	}

}
