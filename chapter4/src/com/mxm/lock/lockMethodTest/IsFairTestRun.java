package com.mxm.lock.lockMethodTest;

public class IsFairTestRun {
	public static void main(String[] args) {
		MyService2 service = new MyService2();
		service.isFairMethod();
		service = new MyService2(false);
		service.isFairMethod();
		service = new MyService2(true);
		service.isFairMethod();
	}
}
