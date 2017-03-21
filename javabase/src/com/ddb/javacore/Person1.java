package com.ddb.javacore;

public class Person1 {
	private String name;//这边不赋值也是可以的
	private int age;//这边是定义一个Person1的类集
	private boolean married;
	
	public Person1(){}
	public Person1(String a,int b, boolean c){
		name = a;
		age = b;
		married = c;
		/*(String str,int i, boolean flag)
		 * 这边的str i flag 
		 * 只是方便知晓记忆并没有实际意义用abc等同效果
		 */
	} 
	public void display(){
		 System.out.println(name+""+age+""+married);
	}

	public static void main(String[] args) {
		Person1 person = new Person1("Rose",20,false);
		person.display();
		
		String address1 = "anhui";
		String address2 = "hefei";
		int code = 5;
		String add = address1 +""+ address2 +""+ code +"号" ;//中间的“”表示空串
		System.out.println("add : " + add);

	}

}
