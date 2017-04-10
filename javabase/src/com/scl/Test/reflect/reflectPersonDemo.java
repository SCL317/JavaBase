package com.scl.Test.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflectPersonDemo {

	public static void main(String[] args) throws Exception {
		
		/*Person person =new Person();
		System.out.println(person);*/
		
		//先获取一个类
		Class c =Class.forName("com.scl.Test.reflect.Person");
		//com.scl.Test.reflect.Person这个可以通过找到Person类文件 
		//然后通过选中Person这个类明右击Copy Qualified Name进行直接拷贝路径
		
		//获取这类里的属性
		Field fld =c.getDeclaredField("age");
		//这里是获取这个类里的方法
		Method mod =c.getMethod("display");//这里调用的是无参的方法
		Method mod2 =c.getMethod("display", String.class,int.class,boolean.class);
		//这里调用的是有参的方法
		
		//实例化这个类
	    Object o =c.newInstance();//调用的无参构造函数
	    //打破封装/使用反射机制可以打破封装性，导致了java对象的属性不安全。  
	    fld.setAccessible(true);
        
	    //通过这个方式给对象o进行赋值
	    fld.set(o, 40);
	    mod.invoke(o);
	    mod2.invoke(o,"zhangsan",22,true);
	   
	    System.out.println(fld.get(o));
	    
	    
	    

	}

}
