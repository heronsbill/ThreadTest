package com.mxm.synchronize.t7;

public class MyThread extends Thread{
	private Task task;
	
	public MyThread(Task task, String name){
		super(name);
		this.task = task;
	}
	
	@Override
	public void run(){
		task.doLongTimeTask();
	}
}
