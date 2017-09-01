package com.mxm.synchronize.synOutAsyn;

public class Run1 {
	public static void main(String[] args) {
		final MyList list = new MyList();
		final MyService service = new MyService();
		
		Thread threadA = new Thread("A"){
			@Override
			public void run(){
				service.addMethod(list, "A");
			}
		};
		Thread threadB = new Thread("B"){
			@Override
			public void run(){
				service.addMethod(list, "B");
			}
		};
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("listSize=" + list.getSize());
	}
}
