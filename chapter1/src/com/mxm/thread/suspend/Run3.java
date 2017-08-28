package com.mxm.thread.suspend;

public class Run3 {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(){
			private Long i = 1L;
			@Override
			public void run(){
				while(true){
					i++;
					System.out.println(i);
				}
			}
		};
		
		thread.start();
		Thread.sleep(500);
		thread.suspend();
		System.out.println("ÄÜÊä³öÃ´£¿");
	}
}
