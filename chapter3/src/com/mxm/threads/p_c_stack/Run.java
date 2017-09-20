package com.mxm.threads.p_c_stack;

public class Run {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		Producer producer = new Producer(myStack);
		Consumer consumer = new Consumer(myStack);
		
		ProducerThread pt = new ProducerThread("生产者", producer);
		ConsumerThread ct = new ConsumerThread("消费者", consumer);
		
		pt.start();
		ct.start();
	}
}
