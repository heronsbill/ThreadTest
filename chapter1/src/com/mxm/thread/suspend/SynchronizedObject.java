package com.mxm.thread.suspend;

public class SynchronizedObject {
	public synchronized void printString(){
		System.out.println("begin");
		if ("A".equals(Thread.currentThread().getName())){
			System.out.println("A线程要被永远suspend了");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}

}
