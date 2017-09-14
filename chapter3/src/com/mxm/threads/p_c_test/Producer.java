package com.mxm.threads.p_c_test;

public class Producer implements Runnable{
	private Object lock;
	public Producer(Object obj){
		this.lock = obj;
	}
	
	@Override
	public void run(){
		while (true){
			try{
				synchronized (lock) {
					if (!"".equals(ObjectValue.value)){
						lock.wait();
					}
					String value = System.currentTimeMillis() + "_" + System.nanoTime();
					System.out.println("producer 开始生产");
					ObjectValue.value = value;
					lock.notify();
				}
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
