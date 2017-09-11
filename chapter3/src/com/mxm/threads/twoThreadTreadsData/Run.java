package com.mxm.threads.twoThreadTreadsData;

public class Run {
	public static void main(String[] args) {
		MyList list = new MyList();
		
		MyThreadA threadA = new MyThreadA("A", list);
		MyThreadB threadB = new MyThreadB("B", list);
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(threadB.getCount());
	}
}
