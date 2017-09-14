package com.mxm.threads.p_c_test;

public class Run {
	public static void main(String[] args) {
		Object obj = new Object();
		
		Thread producer = new Thread(new Producer(obj));
		Thread customer = new Thread(new Customer(obj));
		
		customer.start();
		producer.start();
	}
}
