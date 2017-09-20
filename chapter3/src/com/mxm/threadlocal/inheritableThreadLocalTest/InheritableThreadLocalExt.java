package com.mxm.threadlocal.inheritableThreadLocalTest;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal{
	@Override
	public Object initialValue(){
		return new Date().getTime();
	}
	
	@Override
	public Object childValue(Object parentValue){
		return parentValue + "×ÓÏß³Ì";
	}
}
