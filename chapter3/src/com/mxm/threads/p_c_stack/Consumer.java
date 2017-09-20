package com.mxm.threads.p_c_stack;

public class Consumer {
	private MyStack myStack;
	
	public Consumer(MyStack myStack){
		this.myStack = myStack;
	}
	
	public void consume(){
		myStack.pop();
	}
}
