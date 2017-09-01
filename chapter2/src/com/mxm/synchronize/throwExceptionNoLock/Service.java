package com.mxm.synchronize.throwExceptionNoLock;

public class Service {
	synchronized public void testMethod(){
		System.out.println("ThreadName = " + Thread.currentThread().getName()
				+ " run beginTime = " + System.currentTimeMillis());
		if ("A".equals(Thread.currentThread().getName())){
			while (true){
				if ("0.123456".equals(("" + Math.random()).substring(0, 8))){
					System.out.println("ThreadName = " + Thread.currentThread().getName()
							+ "run exceptionTime = " + System.currentTimeMillis());
					Integer.parseInt("a");
				}
			}
		}
	}
}
