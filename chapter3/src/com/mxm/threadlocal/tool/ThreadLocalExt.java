package com.mxm.threadlocal.tool;

public class ThreadLocalExt extends ThreadLocal{
	@Override
	public Object initialValue(){
		return "我是默认值	第一次get不为null";
	}
}
