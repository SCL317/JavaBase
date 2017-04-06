package com.scl.Test.IO;

import java.io.File;

public class IODemo {

	public static void main(String[] args) {
	  File f1 = new File("a.jpg");
	  File f2 = new File("D./temp/");
	  
	  System.out.println("Name: " +f1.getName());
	  System.out.println("Path: " +f1.getPath());
	  System.out.println("AbsolutePath: " +f1.getAbsolutePath());//绝对路径这里可以文件所处位置
	  System.out.println("Parent: " +f1.getParent());
	  System.out.println("length: " +f1.length());
	  System.out.println("exists: " +f1.exists());
	  System.out.println("canRead: " +f1.canRead());
	  System.out.println("canWrite: " +f1.canWrite());
	  System.out.println("isFile: " +f1.isFile());
	  System.out.println("isHidden: " +f1.isHidden());
	  System.out.println("isDirectory: " +f1.isDirectory());
	  System.out.println("isAbsolute: " +f1.isAbsolute());
	  System.out.println("length: " +f1.length());
	  //f1.delete();
	  
	}

}
