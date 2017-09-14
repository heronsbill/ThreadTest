package com.mxm.threads.watiNotifySize5;

import com.mxm.threads.twoThreadTreadsData.MyList;

public class Run {
	public static void main(String[] args) {
		MyList list = new MyList();
		MyThreadA threadA = new MyThreadA(list);
		MyThreadB threadB = new MyThreadB(list);
		
		threadB.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadA.start();
	}
}
