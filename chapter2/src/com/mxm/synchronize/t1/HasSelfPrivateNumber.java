package com.mxm.synchronize.t1;

public class HasSelfPrivateNumber {
	public void addI(String userName) {
		int num = 0;
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
