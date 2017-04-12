package com.scl.Test.Enum;
public enum Color implements Behaviour{
    //一个源文件中不能有两个public修饰的类  这样编译器不会接受
    	
	RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLOW("黄色", 4);

	private String name;
	private int index;

	//public Color(String name, int index)
	/*Illegal modifier for the enum constructor; only private is permitted.
	枚举构造函数的非法修饰符;仅允许私有。*/
	private Color(String name, int index){
		this.name = name;
		this.index = index;
	}

	@Override
	public void print() {
		System.out.println(this.index+":"+this.name);
	}

	@Override
	public String getInfo() {
		return this.name;
	}

}