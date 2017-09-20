package com.mxm.threads.p_c_stack;

public class Run1 {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		
		Producer producer = new Producer(myStack);
		Consumer consumer1 = new Consumer(myStack);
		Consumer consumer2 = new Consumer(myStack);
		Consumer consumer3 = new Consumer(myStack);
		Consumer consumer4 = new Consumer(myStack);
		Consumer consumer5 = new Consumer(myStack);
		
		ProducerThread pt = new ProducerThread("生产者", producer);
		ConsumerThread ct1 = new ConsumerThread("消费者1", consumer1);
		ConsumerThread ct2 = new ConsumerThread("消费者2", consumer2);
		ConsumerThread ct3 = new ConsumerThread("消费者3", consumer3);
		ConsumerThread ct4 = new ConsumerThread("消费者4", consumer4);
		ConsumerThread ct5 = new ConsumerThread("消费者5", consumer5);
				
		pt.start();
		ct1.start();
		ct2.start();
		ct3.start();
		ct4.start();
		ct5.start();
	}
}
