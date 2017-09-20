package com.mxm.threads.p_c_stack;

public class Producer {
	private MyStack myStack;
	
	public Producer(MyStack myStack){
		this.myStack = myStack;
	}
	
	public void produce(){
		myStack.push();
	}
}
