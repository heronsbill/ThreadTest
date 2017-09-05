package com.mxm.synchronize.synAndString;

public class Service {
	public void print(String lock){
		try{
			synchronized(lock){
				while (true){
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public void print(Object lock){
		try{
			synchronized(lock){
				while (true){
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
