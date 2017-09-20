package com.mxm.threads.joinLong;

public class Run {
	public static void main(String[] args) {
		Thread thread = new Thread(){
			@Override
			public void run(){
				try {
					Thread.sleep(1000);
					System.out.println("sleep end");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		thread.start();
		try {
			thread.join(6000);
			System.out.println("join end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
