package com.mxm.threadlocal.isolation;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal{
	@Override
	public Object initialValue(){
		return new Date().getTime();
	}
}
