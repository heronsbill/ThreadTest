package com.mxm.synchronize.synBlockNoDeadLoop;

public class Service2 {
	Object obj1 = new Object();
	public void method1(){
		synchronized(obj1){
			System.out.println("method1 begin");
			boolean flag = true;
			while (flag){
			}
			System.out.println("method2 end");
		}
	}
	
	Object obj2 = new Object();
	public void method2(){
		synchronized (obj2) {
			System.out.println("method2 begin");
			System.out.println("method2 end");
		}
	}
}
