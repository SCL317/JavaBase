package com.scl.Test.exam;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 打印乘法口诀表到文件中。 要求： A.创建一个普通类，类里有一个普通的方法，打印乘法口诀表的方法；
 * B.在另一个测试类中，创建一个实现Runnable接口的线程； C.在run()方法中，使用反射唤醒打印乘法口诀表的方法；
 * D.启动线程，打印乘法口诀表到文件中！
 */

public class JiuJiu {

	public void display() throws FileNotFoundException {

		PrintStream ps = new PrintStream("D:\\JJtext.txt");

		for (int i = 1; i <= 9; i++) // 控制行
		{
			for (int j = 1; j <= i; j++)// 控制单行的列数也就是单行的有多少个。
			{
				ps.print((j + "*" + i + "=" + j * i + "\t"));
			}
			ps.println();
		}
	}

}
