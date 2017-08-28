package com.mxm.thread.getid;

public class Test {
	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName() + " " + currentThread.getId());
	}
}
