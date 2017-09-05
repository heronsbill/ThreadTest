package com.mxm.synchronize.synBlockNoDeadLoop;

public class Service1 {
	synchronized public void methodA(){
		System.out.println("methodA begin");
		boolean flag = true;
		while (flag){
		}
		System.out.println("methodA end");
	}
	
	synchronized public void methodB(){
		System.out.println("methodB begin");
		System.out.println("methodB end");
	}
}
