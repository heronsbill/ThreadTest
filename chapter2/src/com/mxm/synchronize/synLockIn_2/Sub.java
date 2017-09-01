package com.mxm.synchronize.synLockIn_2;

public class Sub extends Main{
	synchronized public void operateISubMethod(){
		while(i > 0){
			System.out.println("sub print i = " + i);
			i--;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
