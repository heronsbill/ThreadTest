package com.mxm.synchronize.synStaticMethod;

public class Service {
	public synchronized static void methodA(){
		System.out.println("线程名称：" + Thread.currentThread().getName()
				+ "在" + System.currentTimeMillis() + "进入了methodA方法");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("线程名称：" + Thread.currentThread().getName()
				+ "在" + System.currentTimeMillis() + "退出了methodA方法");
	}
	public synchronized static void methodB(){
		System.out.println("线程名称：" + Thread.currentThread().getName()
				+ "在" + System.currentTimeMillis() + "进入了methodB方法");
		System.out.println("线程名称：" + Thread.currentThread().getName()
				+ "在" + System.currentTimeMillis() + "退出了methodB方法");
	}
	public synchronized void methodC(){
		System.out.println("线程名称：" + Thread.currentThread().getName()
				+ "在" + System.currentTimeMillis() + "进入了methodC方法");
		System.out.println("线程名称：" + Thread.currentThread().getName()
				+ "在" + System.currentTimeMillis() + "退出了methodC方法");
	}
	
	public void methodD(){
		synchronized(this.getClass()){
			System.out.println("线程名称：" + Thread.currentThread().getName()
					+ "在" + System.currentTimeMillis() + "进入了methodD方法");
			System.out.println("线程名称：" + Thread.currentThread().getName()
					+ "在" + System.currentTimeMillis() + "退出了methodD方法");
		}
	}
}
