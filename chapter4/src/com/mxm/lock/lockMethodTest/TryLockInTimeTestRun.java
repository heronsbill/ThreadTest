package com.mxm.lock.lockMethodTest;

public class TryLockInTimeTestRun {
	public static void main(String[] args) throws InterruptedException {
		final MyService3 service = new MyService3();
		
		Runnable tryLockRun = new Runnable(){
			@Override
			public void run(){
				service.tryLockInTimeMethod();
			}
		};
		//立即获取锁
		Thread thread1 = new Thread(tryLockRun, "A");
		thread1.start();
		Thread.sleep(100);
		
		//3秒内获取到锁
		Thread thread2 = new Thread(tryLockRun, "B");
		thread2.start();
		Thread.sleep(3100);
		
		//其他线程先持有锁
		Thread thread = new Thread(){
			@Override
			public void run(){
				service.tryLockMethod();
			}
		};
		thread.start();
		
		//3秒内被中断
		Thread thread3 = new Thread(tryLockRun, "C");
		thread3.start();
		Thread.sleep(100);
		thread3.interrupt();
		
	}
}
