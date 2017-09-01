package com.mxm.synchronize.synOutAsyn;

public class MyThreadB extends Thread{
	private MyList list;
	public MyThreadB(MyList list, String name){
		super(name);
		this.list = list;
	}
	
	@Override
	public void run(){
		for (int i = 0; i < 1000; i++){
			list.add("ThreadB" + (i+1));
		}
	}
}
