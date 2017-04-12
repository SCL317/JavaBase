package com.scl.Test.Enum;

import lombok.Getter;
import lombok.Setter;

@Getter
// @Setter
public enum EnumDemo2 {
	// 这些文件其实都是被static final 修饰的详细见下javap烦编译结果
	MONDAY(1, "星期一"), TUESDAY(2, "星期二"), WEDNESDAY(3, "星期三"), THUSDAY(4, "星期四"), FRIDAY(5, "星期五"), SATURDAY(6,
			"星期六"), SUNDAY(7, "星期日");

	/*
	 * @ setter仅支持在一个类或一个字段。 所以这里不能将@setter放在enum生成的EnumDemo2上因为这只是个枚举
	 */
	@Setter
	private int index;
	@Setter
	private String desc;

	private EnumDemo2(int index, String desc) {
		this.index = index;
		this.desc = desc;
	}

	@Override
	public String toString() { 
		return this.index + "_" + this.desc;
	}

	public static void main(String[] args) {
		System.out.println(EnumDemo2.MONDAY.toString());
		
	}
}

/*
 * Compiled from "EnumDemo2.java" public final class com.scl.Test.Enum.EnumDemo2
 * extends java.lang.Enum<com.scl.Test.Enum.EnumDemo2> { public static final
 * com.scl.Test.Enum.EnumDemo2 MONDAY; public static final
 * com.scl.Test.Enum.EnumDemo2 TUESDAY; public static final
 * com.scl.Test.Enum.EnumDemo2 WEDNESDAY; public static final
 * com.scl.Test.Enum.EnumDemo2 THUSDAY; public static final
 * com.scl.Test.Enum.EnumDemo2 FRIDAY; public static final
 * com.scl.Test.Enum.EnumDemo2 SATURDAY; public static final
 * com.scl.Test.Enum.EnumDemo2 SUNDAY; static {}; public void setIndex(int);
 * public void setDesc(java.lang.String); public int getIndex(); public
 * java.lang.String getDesc(); public static com.scl.Test.Enum.EnumDemo2[]
 * values(); public static com.scl.Test.Enum.EnumDemo2
 * valueOf(java.lang.String); }
 */