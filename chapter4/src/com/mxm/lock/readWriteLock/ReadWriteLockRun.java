package com.mxm.lock.readWriteLock;

public class ReadWriteLockRun {
	public static void main(String[] args) throws InterruptedException {
		final MyService service = new MyService();
		
		Thread read = new Thread("read"){
			@Override
			public void run(){
				service.read();
			}
		};
		
		Thread write = new Thread("write"){
			@Override
			public void run(){
				service.write();
			}
		};
		
//		read.start();
//		Thread.sleep(100);
//		write.start();
		
		write.start();
		Thread.sleep(100);
		read.start();
	}
}
