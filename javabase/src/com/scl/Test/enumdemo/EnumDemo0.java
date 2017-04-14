package com.scl.Test.enumdemo;

import lombok.Getter;
import lombok.Setter;
@Getter
public enum EnumDemo0 implements Behaviour{

	MONDAY(1, "星期一"), TUESDAY(2, "星期二"), WEDNESDAY(3, "星期三"),
	THURDAY(4, "星期四"), FRIDAY(5, "星期五"){
		@Override
		// 在接口的实例中重写指定的方法
		public boolean isRest() {
			return true;
		}
	}, //这里都是逗号；
	 SATURDAY(6, "星期六"){
		@Override
		// 在接口的实例中重写指定的方法
		public boolean isRest() {
			return true;
		}
	};
	
	
	@Setter // @Setter不支持写在枚举上面
	private int index; // 索引
	@Setter
	private String desc; // 描述//成员变量   注意范围
	private EnumDemo0(int index,String desc) {
		this.index = index;
		this.desc = desc;
	}

	public boolean isRest() { //判断是否上班
		return false;
	}

	@Override
	public void print() {
		System.out.println("我是print方法打印的内容：" + this.index + "--" + this.desc);
	}

	@Override
	public String getInfo() {
		return "EnumDemo0:" + this.index + "--" + this.desc;
	}
}
