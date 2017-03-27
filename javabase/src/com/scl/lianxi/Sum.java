package com.scl.lianxi;

public class Sum {

	public static void main(String[] args) {
	int sum = 0; // 保存 1-50 之间偶数的和
        
		int num = 2; // 代表 1-50 之间的偶数
        
		do {
			//实现累加求和
            
            sum += num ;
			num = num + 2; // 每执行一次将数值加2，以进行下次循环条件判断
            
		} while ((num<=50)&&(num%2==0)); // 满足数值在 1-50 之间时重复执行循环
        
		System.out.println(" 50以内的偶数之和为：" + sum );

	}

}
