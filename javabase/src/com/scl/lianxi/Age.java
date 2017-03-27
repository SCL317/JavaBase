package com.scl.lianxi;

public class Age {

	public static void main(String[] args) {
		int age1 = 24;
		int age2 = 18;
		int age3 = 36;
		int age4 = 27;
		int sum = age1 + age2 + age3 + age4;
		double avg = sum / 4;
		int minus = age1 - age2;
		int newAge = age1--;
		System.out.println("年龄总和：" + sum);
		System.out.println("平均年龄：" + avg);
		System.out.println("年龄差值：" + minus);
		System.out.println("自减后的年龄：" + newAge);

		int one = 10;
		int two = 20;
		int three = 0;
		three = one + two;
		three += one;
		three -= one;
		three *= one;
		three /= one;
		three %= one;
		System.out.println("three : " + three);

		int score=68;
		
		String mark =score >= 60 ? "及格" : "不及格";
		System.out.println("考试成绩如何："+mark);
		
		int age=25;
		if(age>=60){
		    System.out.println("老年");
		//if(60>age>=40)操作符> =无定义的参数类型(s)布尔,int
		}else if((60>age)&&(age>=40)){
		    System.out.println("中年");
		}else if((40>age)&&(age>=18)){
		    System.out.println("少年");
		}else{
		    System.out.println("童年");
		}
	
		
		int score1 = 94;
		String sex = "女";
        if(score1>80){
        	//这个时候不能写赋值= 应该写==
            if(sex == "女"){
                System.out.println("进入女子组决赛");
            }else{
                System.out.println("进入男子组决赛");
                
            }
            
        }else{
            System.out.println("淘汰");
        }
        
    
char today='日';
switch(today){
    //这里的case 不能写成case '一''三''五'：
	case '一':
	case '三':
	case '五':
	 System.out.println("早餐吃包子");
	 break;
	case '二':
	case '四':
	case '六':
	 System.out.println("早餐吃油条");
	 break;
     default:
     System.out.println("吃主席套餐");
}
     
     
	}

}
