package com.scl.Test.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.jar.Attributes.Name;

import javax.naming.event.NamespaceChangeListener;

public class TestDateByteStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("myfile.date");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF("罗斯福");
			dos.writeInt(40);
			dos.close();

			FileInputStream fis = new FileInputStream("myfile.date");
			DataInputStream dis = new DataInputStream(fis);
			System.out.println("name: " + dis.readUTF());
			System.out.println("age: " + dis.readInt());
			fis.close();

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
