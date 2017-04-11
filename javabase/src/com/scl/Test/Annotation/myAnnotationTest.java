package com.scl.Test.Annotation;

import java.lang.reflect.Field;

public class myAnnotationTest {

	public static void main(String[] args) throws Exception, SecurityException {
		Class<?> c = Person.class;

		Person person = (Person) c.newInstance();
		System.out.println("这里是找到注释前的：");
		person.display();

		Field[] fld = c.getDeclaredFields();

		for (Field field : fld) {
			if (field.isAnnotationPresent(myAnnotation.class)) {
			//判断该程序元素上是否包含指定类型的注解，存在则返回true，否则返回false.
				myAnnotation ma = field.getAnnotation(myAnnotation.class);
				//getAnnotation如果存在该元素的指定类型的注释，则返回这些注释，否则返回 null。
				System.out.println("myAnnotation注解的值:" + ma.value());
				
				field.setAccessible(true);

				field.set(person, ma.value());
				
			/*	switch (field.getType().getSimpleName().toString()) {
				case "int":
					field.get(Integer.valueOf(ma.value()));
					break;
				case "char":
					field.get((char)Character.valueOf(ma.value()));
					default:
					break;
					
				}*/
			}
		}
		System.out.println("这里是找到注释后的：");
		person.display();
	}

}
