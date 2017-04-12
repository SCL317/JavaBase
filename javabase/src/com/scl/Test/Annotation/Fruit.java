package com.scl.Test.Annotation;

/**
 * @Override 是一个标记注解类型，它被用作标注方法。它说明了被标注的方法重载了
 *           父类的方法，起到了断言的作用。如果我们使用了这种Annotation在一个没有覆盖
 *           父类方法的方法时，java编译器将以一个编译错误来警示。
 *           这个annotaton常常在我们试图覆盖父类方法而确又写错了方法名时发挥威力。
 */
public class Fruit {

	public void displayName() {
		System.out.println("水果的名字是：*****");
	}
}

class Orange extends Fruit {
	@Override
	public void displayName() {
		System.out.println("水果的名字是：桔子");
	}
}

class Apple extends Fruit {
	@Override
	// @Override 如果将@Override注释掉则系统不会报错 应为没有@Override进行判断
	//public void displayname() 
	public void displayName() 
	{
		// 这里的方法父类中没有
		System.out.println("水果的名字是：苹果");
	}
}