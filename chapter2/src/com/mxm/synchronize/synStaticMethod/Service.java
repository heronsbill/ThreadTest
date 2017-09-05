package com.mxm.synchronize.synStaticMethod;

public class Service {
	public synchronized static void methodA(){
		System.out.println("�߳����ƣ�" + Thread.currentThread().getName()
				+ "��" + System.currentTimeMillis() + "������methodA����");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�߳����ƣ�" + Thread.currentThread().getName()
				+ "��" + System.currentTimeMillis() + "�˳���methodA����");
	}
	public synchronized static void methodB(){
		System.out.println("�߳����ƣ�" + Thread.currentThread().getName()
				+ "��" + System.currentTimeMillis() + "������methodB����");
		System.out.println("�߳����ƣ�" + Thread.currentThread().getName()
				+ "��" + System.currentTimeMillis() + "�˳���methodB����");
	}
	public synchronized void methodC(){
		System.out.println("�߳����ƣ�" + Thread.currentThread().getName()
				+ "��" + System.currentTimeMillis() + "������methodC����");
		System.out.println("�߳����ƣ�" + Thread.currentThread().getName()
				+ "��" + System.currentTimeMillis() + "�˳���methodC����");
	}
	
	public void methodD(){
		synchronized(this.getClass()){
			System.out.println("�߳����ƣ�" + Thread.currentThread().getName()
					+ "��" + System.currentTimeMillis() + "������methodD����");
			System.out.println("�߳����ƣ�" + Thread.currentThread().getName()
					+ "��" + System.currentTimeMillis() + "�˳���methodD����");
		}
	}
}
