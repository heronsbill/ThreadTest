package com.mxm.threadlocal.isolation;

public class ThreadA extends Thread{
	@Override
	public void run(){
		for (int i = 0; i < 10; i++){
			System.out.println("ThreadAµÄÖµ£º" + Tools.tle.get());
		}
	}
}
