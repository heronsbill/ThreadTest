package com.mxm.thread.suspend;

public class MyObject {
	private String userName = "1";
	private String passWord = "123";
	
	public void setValue(String u, String p){
		this.userName = u;
		if ("A".equals(Thread.currentThread().getName())){
			System.out.println("A 线程要暂停了");
			Thread.currentThread().suspend();
		}
		this.passWord = p;
	}
	
	public void printObject(){
		System.out.println(userName + passWord);
	}
}
