package com.mxm.threads.p_c_AllWait;

public class Consumer {
	private Object lock;
	
	public Consumer(Object lock){
		this.lock = lock;
	}
	
	public void consume(){
		try{
			synchronized (lock) {
				while ("".equals(Goods.value)){
					System.out.println(Thread.currentThread().getName() + "����ȴ�");
					lock.wait();
				}
				System.out.println(Thread.currentThread().getName() + "������");
				Goods.value = "";
				lock.notifyAll();
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
