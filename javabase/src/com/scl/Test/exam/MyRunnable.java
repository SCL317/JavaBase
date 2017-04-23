package com.scl.Test.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.scl.Test.xunhuan.JiuJiu;

/**
打印乘法口诀表到文件中。
要求：
A.创建一个普通类，类里有一个普通的方法，打印乘法口诀表的方法；
B.在另一个测试类中，创建一个实现Runnable接口的线程；
C.在run()方法中，使用反射唤醒打印乘法口诀表的方法；
D.启动线程，打印乘法口诀表到文件中！ 
 */

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		try {
			
			Class<?> class1 =Class.forName("com.scl.Test.exam.JiuJiu2");
			Method mod = class1.getMethod("display");
			Method mod1 = class1.getMethod("display1");
			Object o = class1.newInstance();
            mod.invoke(o);
            mod1.invoke(o);
    
		} catch (Exception e) {
			e.printStackTrace();
		} 	
	}
}
