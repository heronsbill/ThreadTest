package com.mxm.threads.p_c_test;

public class Customer implements Runnable{
	private Object obj;
	
	public Customer(Object obj){
		this.obj = obj;
	}
	@Override
	public void run() {
		while(true){
			try{
				synchronized (obj) {
					if ("".equals(ObjectValue.value)){
						obj.wait();
					}
					String value = ObjectValue.value;
					System.out.println("customer 开始消费" + value);
					ObjectValue.value = "";
					obj.notify();
				}
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
