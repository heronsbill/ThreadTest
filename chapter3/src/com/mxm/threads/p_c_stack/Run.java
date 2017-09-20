package com.mxm.threads.p_c_stack;

public class Run {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		Producer producer = new Producer(myStack);
		Consumer consumer = new Consumer(myStack);
		
		ProducerThread pt = new ProducerThread("������", producer);
		ConsumerThread ct = new ConsumerThread("������", consumer);
		
		pt.start();
		ct.start();
	}
}
