package com.mxm.synchronize.synLockIn_2;

public class Main {
	protected int i = 10;
	
	synchronized public void operateIMainMethod(){
		try{
			i--;
			System.out.println("main print i = " + i);
			Thread.sleep(100);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
