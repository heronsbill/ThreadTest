package com.mxm.threads.p_c_AllWait;

public class Run {
	public static void main(String[] args) {
		Object object = new Object();
		Producer p = new Producer(object);
		Consumer c = new Consumer(object);
		ProducerThread[] pt = new ProducerThread[5];
		ConsumerThread[] ct = new ConsumerThread[5];
		for (int i = 0; i < 3; i++){
			pt[i] = new ProducerThread("生产者 " + (i + 1), p);
			ct[i] = new ConsumerThread("消费者 " + (i + 1), c);
			pt[i].start();
			ct[i].start();
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		
		for (int i = 0; i < threadArray.length; i++){
			System.out.println(threadArray[i].getName() + " "
					+ threadArray[i].getState());
		}
	}
}
