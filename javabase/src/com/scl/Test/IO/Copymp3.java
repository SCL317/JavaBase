package com.scl.Test.IO;

/**
 * java字节流复制一个mp3文件
 * 4种方式
*/
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copymp3 {

	public static void main(String[] args) throws IOException {
		Copy_1();//使用创建字节数组的方式copy
		copy_2();//使用buffered缓冲区的方式进行copy
		copy_3();//不推荐方式    定义一个文件长度的字节数组直接copy
		copy_4();//强烈不推荐    读一个字节写一个字节的方式极其不推荐

	}

	private static void copy_4() throws IOException {
		//这种方式极其不推荐因为是读取一个字节写一个字节这样的速度太慢
		//和通过字节数组和buffered的这两种方式比起来速度太慢
		FileInputStream fis =new FileInputStream("0.mp3"); 
		FileOutputStream fos =new FileOutputStream("4.mp3");
		int ch=0;
		while((ch=fis.read())!=-1){
			fos.write(ch);
		}
		fis.close();//一定不要忘了关闭流
		fos.close();
		
	}

	private static void copy_3() throws IOException {
		
		FileInputStream fis =new FileInputStream("0.mp3"); 
		FileOutputStream fos =new FileOutputStream("3.mp3");
		byte[] bt =new byte[fis.available()];
		//这里是创建一个和目标文件一样长度的字节数组这样就不需要去判断了
		//一般不建议用，文件太大消耗内存大
        fis.read(bt);
        fos.write(bt);
    	fis.close();//一定不要忘了关闭流
		fos.close();
		}
	
	

	private static void copy_2() throws IOException {
		//这里通过buffered缓冲区的方法来copy一个文件
		FileInputStream fis =new FileInputStream("0.mp3"); 
		BufferedInputStream bufis = new BufferedInputStream(fis);
		FileOutputStream fos =new FileOutputStream("2.mp3");
		BufferedOutputStream bufos =new BufferedOutputStream(fos);
		
	/*  byte[] bt =new byte[4096];
		int len=0;
		while((len=bufis.read(bt))!=-1){
			bufos.write(bt, 0, len);
		}//这里通过这个建立字节数组也是可以得
*/
		int ch=0;
		while((ch=bufis.read())!=-1){
			bufos.write(ch);
			//bufos.flush();这里最好不要刷新因为这样没循环一次就刷新一次速度会很慢
		}
		bufis.close();//一定要记得关闭流
		bufos.close();
	}

	private static void Copy_1() throws IOException {
	/*首先我们先读取一个一个文件（出了文档一些比如MP3等格式都是二进制文件这里
	都需要用到字节流的读写，因为字节流的读写适用于文本和二进制  而字符流只适合文本的读写）*/
	FileInputStream fis =new FileInputStream("0.mp3"); 
	
	FileOutputStream fos =new FileOutputStream("1.mp3");
	byte[] bt =new byte[4096];
	int len=0;
	while((len=fis.read(bt))!=-1){
		fos.write(bt,0, len);
	}
	fis.close();//一定不要忘了关闭流
	fos.close();
	}

}
