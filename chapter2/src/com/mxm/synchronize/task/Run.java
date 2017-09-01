package com.mxm.synchronize.task;

public class Run {
	public static void main(String[] args) {
		Task task = new Task();
		MyThread1 thread1 = new MyThread1();
		MyThread2 thread2 = new MyThread2();
		
		thread1.setTask(task);
		thread2.setTask(task);
		
		thread1.start();
		thread2.start();
		
		try{
			Thread.sleep(10000);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		
		long beginTime = getMinLong(CommonUtils.beginTime1, CommonUtils.beginTime2);
		long endTime = getMaxLong(CommonUtils.endTime1, CommonUtils.endTime2);
		System.out.println("ºÄÊ±£º" + (endTime - beginTime)/1000 + "s");
	}
	
	public static long getMaxLong(long l1, long l2){
		return (l1 > l2? l1 : l2);
	}
	
	public static long getMinLong(long l1, long l2){
		return (l1 < l2? l1 : l2);
	}
}
