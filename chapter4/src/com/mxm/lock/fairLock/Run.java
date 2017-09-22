package com.mxm.lock.fairLock;

public class Run {
	public static void main(String[] args) {
		final MyService service = new MyService(false);
		
		Runnable runnable = new Runnable(){
			@Override
			public void run(){
				System.out.println("*****" + Thread.currentThread().getName() + "开始运行");
				service.testMethod();
			}
		};
		Thread[] threads = new Thread[10];
		for (int i = 0; i < 10; i++){
			threads[i] = new Thread(runnable);
		}
		
		for (int i = 0; i < 10; i++){
			threads[i].start();
		}
	}
}
