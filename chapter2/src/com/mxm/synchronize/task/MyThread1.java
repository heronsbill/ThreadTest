package com.mxm.synchronize.task;

public class MyThread1 extends Thread{ 
	private Task task;
	
	public void setTask(Task task){
		this.task = task;
	}
	@Override
	public void run(){
		CommonUtils.beginTime1 = System.currentTimeMillis();
//		task.doLongTimeTask();
		task.doLongTimeTask2();
		CommonUtils.endTime1 = System.currentTimeMillis();
	}
}
