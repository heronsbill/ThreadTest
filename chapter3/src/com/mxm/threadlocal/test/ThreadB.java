package com.mxm.threadlocal.test;

import com.mxm.threadlocal.tool.Tools;

public class ThreadB extends Thread{
	@Override
	public void run(){
		if (Tools.tl.get() == null){
			Tools.tl.set("threadB" + System.currentTimeMillis());
		}
		System.out.println(Tools.tl.get());
	}
}
