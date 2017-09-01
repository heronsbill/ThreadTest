package com.mxm.synchronize.task;

public class MyThread2 extends Thread{ 
	private Task task;
	
	public void setTask(Task task){
		this.task = task;
	}
	@Override
	public void run(){
		CommonUtils.beginTime2 = System.currentTimeMillis();
//		task.doLongTimeTask();
		task.doLongTimeTask2();
		CommonUtils.endTime2 = System.currentTimeMillis();
	}
}
