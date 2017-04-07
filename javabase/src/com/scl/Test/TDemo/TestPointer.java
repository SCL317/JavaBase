package com.scl.Test.TDemo;

import java.util.Date;

public class TestPointer {

	public static void main(String[] args) {
		Point<Integer> pi = new Point<Integer>(20,40);
		pi.setX(pi.getX()+100);
		pi.showInfo();
		
		/*Point<Date> pd = new Point<Date>();
		pd.setX(new Date(888888));
		pd.setY(new Date(999999));
		pd.showInfo();
        //这里如果Point<T extends Number> 而Date不属于Number
		//所以这里用Date会报错
		//如果这里是Point<T> 则不会出现问题
*/	}

}
