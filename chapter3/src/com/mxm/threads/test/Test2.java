package com.mxm.threads.test;

public class Test2 {
	public static void main(String[] args) {
		try {
			String lock = new String();
			System.out.println("syn����");
			synchronized (lock) {
				System.out.println("syn��һ��");
					lock.wait();
				
				System.out.println("wait����");
			}
			System.out.println("syn����");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}