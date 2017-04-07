package com.scl.Test.TDemo;

public class Test {

	public static void main(String[] args) {
		Test t =new Test(); 
		String valid1=t.evaluate("tiger","tiger");
        Integer valid2=t.evaluate(new Integer(300),new Integer(300));
        System.out.println(valid1);
        System.out.println(valid2);
	}
	
	public <T> T evaluate(T a,T b){
		if (a.equals(b)) {
			return a;
		}else{
			return null;
		}
	}

}
