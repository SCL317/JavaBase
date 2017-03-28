/**
 * 
 */
package com.scl.Test.ood;

/**
 * @author Administrator
 *
 */
public interface IsStudent {
	
	//这里是接口承诺方法 调用时不需要参数
	public void study();
	
	//这里是接口承诺方法 调用时需要参数
	public void study(String java);

}
