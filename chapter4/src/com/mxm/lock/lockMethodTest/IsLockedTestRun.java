package com.mxm.lock.lockMethodTest;

public class IsLockedTestRun {
	public static void main(String[] args) {
		MyService2 service = new MyService2();
		service.isLockedMethod();
		System.out.println("main thread test lock.islocked :" 
				+ service.getLock().isLocked());
	}
}
