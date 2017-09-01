package com.mxm.synchronize.t7;

public class Test {
	public void tt(){
		synchronized(this.getClass()){
			System.out.println(Thread.currentThread().getName()
					+ " begin time = " + System.currentTimeMillis());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()
					+ " end time = " + System.currentTimeMillis());
		}
	}
	
	public synchronized static void tts(){

		System.out.println(Thread.currentThread().getName()
				+ " begin time = " + System.currentTimeMillis());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()
				+ " end time = " + System.currentTimeMillis());
	}
	
	synchronized public void ttt(){
		System.out.println(Thread.currentThread().getName()
				+ " begin time = " + System.currentTimeMillis());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()
				+ " end time = " + System.currentTimeMillis());
	}
}
