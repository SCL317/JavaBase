package com.scl.Test.IO2;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
    private int personid;
    private String name;
    private String pass;
    
    public Person(){
    }
    public Person (int personid , String name ,String pass){
    	this.personid=personid;
    	this.name=name;
    	this.pass=pass;
    }
    
    @Override
    public String toString(){
    	return "Personid: "+personid+"\tName: "+name+"\tPass: "+pass;
    }
}
