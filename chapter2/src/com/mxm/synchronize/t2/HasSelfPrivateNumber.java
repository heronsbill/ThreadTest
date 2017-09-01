package com.mxm.synchronize.t2;

public class HasSelfPrivateNumber {
	private int num = 0;
	public void addI(String userName) {
		if ("A".equals(userName)){
			num = 100;
			System.out.println(userName + "'s num set over");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else{
			System.out.println(userName + "'s num set over");
			num = 200;
		}
		System.out.println(userName + " num = " + num);
	}
	
	public synchronized void addN(String userName){
		if ("A".equals(userName)){
			num = 100;
			System.out.println(userName + "'s num set over");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else{
			System.out.println(userName + "'s num set over");
			num = 200;
		}
		System.out.println(userName + " num = " + num);
	}
}
