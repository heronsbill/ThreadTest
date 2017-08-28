package com.mxm.thread.sleep;

public class Run {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		System.out.println("begin = " + System.currentTimeMillis());
		mt.run();
		System.out.println("end = " + System.currentTimeMillis());
	}
}
