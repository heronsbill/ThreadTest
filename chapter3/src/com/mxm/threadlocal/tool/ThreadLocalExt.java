package com.mxm.threadlocal.tool;

public class ThreadLocalExt extends ThreadLocal{
	@Override
	public Object initialValue(){
		return "����Ĭ��ֵ	��һ��get��Ϊnull";
	}
}
