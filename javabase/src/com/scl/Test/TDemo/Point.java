package com.scl.Test.TDemo;

public class Point<T extends Number> {
	//这里的T泛型继承了Number，所以我们在使用T泛型的时候要考虑T的范围了
    
	private T x;
	private T y;
	public Point(){	
	}
	
	public Point(T x,T y){
		this.x=x;
		this.y=y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}
	
	public void showInfo(){
		System.out.println("x="+x+",y="+y);
	}
}
