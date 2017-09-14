package com.mxm.threads.test;

public class Test1 {
	public static void main(String[] args) {
		String lock = new String();
		try {
			lock.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
