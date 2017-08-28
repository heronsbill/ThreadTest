package com.mxm.thread.priority;

public class Run2 {
	public static void main(String[] args) throws InterruptedException {
		MyThreadI threadI = new MyThreadI();
		threadI.setPriority(Thread.NORM_PRIORITY + 3);
		MyThreadII threadII = new MyThreadII();
		threadII.setPriority(Thread.NORM_PRIORITY - 3);
		
		threadI.start();
		threadII.start();
		
		Thread.sleep(200);
		threadI.stop();
		threadII.stop();
		System.out.println("I = " + threadI.getCount());
		System.out.println("II = " + threadII.getCount());
		
		
	}
}
