package com.mxm.threads.joinTest;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.run();
		try {
			thread.join();
			System.out.println("我想在thread运行完后再执行，我做到了？");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
