package com.ddb.javacore;
import java.util.Scanner;

public class TestName{
    public static void main(String[] args){
      System.out.println("请输入你的名字:");
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      System.out.println("你的名字是:"+name);
}
}