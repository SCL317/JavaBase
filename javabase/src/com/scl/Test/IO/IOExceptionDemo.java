package com.scl.Test.IO;

/**
 * 关于IO如何用try-catch-finally捕捉处理异常
 */
import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	public static void main(String[] args) {
		/*
		 * FileWriter fw = new FileWriter("demo.txt");
		 * 1.java.io.FileNotFoundException: C:\demo.txt (拒绝访问。) 找不到指定位置的东西时会报出异常
		 * 4.由于3的原因但是应为这样这个语句会不在try所以有异常的时候try-catch无法报错
		 */
		FileWriter fw = null;// 5.这就技能使用fw又不影响找不到文件而报错了
		try {
			fw = new FileWriter("demo.txt");
			fw.write("asdfg");
			/*
			 * 2.如果这边我们文件也创建成功了但是在写东西的时候写失败了这时候fw.write("asdfg");执行失败了报错
			 * 但是这时候fw.close();不能正常运行了程序会在占用系统资源，这时候我们需要用到try-catch-finally
			 * 因为不管这么执行finally除了退出虚拟机（system.exit(1)）finally在异常里都会执行
			 */
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			if (fw != null) //这里我们判别文件存不存在避免fw.close()空指针异常 
			try {
					fw.close();                 
			} catch (IOException e) {
				e.printStackTrace();
			}
			/*
			 * 3.我们将关闭放在这里的时候fw因为不在所属的作用范围内所以会报错这时候我们需要将 FileWriter fw = new
			 * FileWriter("demo.txt");中的fw变成我们能访问的
			 */
		}

	}

}
