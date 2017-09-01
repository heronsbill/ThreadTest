package com.mxm.synchronize.synOutAsyn;

public class MyThreadA extends Thread{
	private MyList list;
	public MyThreadA(MyList list, String name){
		super(name);
		this.list = list;
	}
	
	@Override
	public void run(){
		for (int i = 0; i < 1000; i++){
			list.add("ThreadA" + (i+1));
		}
	}
}
