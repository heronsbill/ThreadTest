package com.mxm.threads.p_c_AllWait;

public class Producer {
	private Object lock;
	
	public Producer(Object lock){
		this.lock = lock;
	}
	
	public void create(){
		try{
			synchronized (lock) {
				while (!"".equals(Goods.value)){
					System.out.println(Thread.currentThread().getName() + "����ȴ�");
					lock.wait();
				}
				System.out.println(Thread.currentThread().getName() + "������");
				String value = System.currentTimeMillis() + "_" + System.nanoTime();
				Goods.value = value;
				lock.notifyAll();
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
