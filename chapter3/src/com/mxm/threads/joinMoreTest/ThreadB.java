package com.mxm.threads.joinMoreTest;

public class ThreadB extends ThreadA{
	private ThreadA threadA;
	
	public ThreadB(ThreadA threadA){
		this.threadA = threadA;
	}
	
	@Override
	public void run(){
		try{
			synchronized (threadA) {
				System.out.println("ThreadB begin at time= "
						+ System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("ThreadB end at time="
						+ System.currentTimeMillis());
			}
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
