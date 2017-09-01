package com.mxm.synchronize.t3;

public class PublicVar {
	private String userName = "11";
	private int age = 11;
	
	synchronized public void setValue(String userName, int age){
		this.userName = userName;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.age = age;
	}
	
	public String toString(){
		return "userName = " + userName + ", age = " + age;
	}
}
