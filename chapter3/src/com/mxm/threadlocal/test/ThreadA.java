package com.mxm.threadlocal.test;

import com.mxm.threadlocal.tool.Tools;

public class ThreadA extends Thread{
	@Override
	public void run(){
		if (Tools.tl.get() == null){
			Tools.tl.set("threadA" + System.currentTimeMillis());
		}
		System.out.println(Tools.tl.get());
	}
}
