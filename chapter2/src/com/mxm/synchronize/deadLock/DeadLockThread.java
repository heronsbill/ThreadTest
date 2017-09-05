package com.mxm.synchronize.deadLock;

public class DeadLockThread extends Thread{
	private String flag;
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	public void setFlag(String flag){
		this.flag = flag;
	}
	
	@Override
	public void run(){
		if ("A".equals(flag)){
			synchronized (lock1) {
				System.out.println("flag=" + flag);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("按 lock1 -> lock2 代码顺序执行了");
				}
			}
		}
		if ("B".equals(flag)){
			synchronized (lock2) {
				System.out.println("flag=" + flag);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println("按 lock2 -> lock1 代码顺序执行了");
				}
			}
		}
	}
}
