package com.mxm.threads.test;

public class Test2 {
	public static void main(String[] args) {
		try {
			String lock = new String();
			System.out.println("syn上面");
			synchronized (lock) {
				System.out.println("syn第一行");
					lock.wait();
				
				System.out.println("wait下面");
			}
			System.out.println("syn下面");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
