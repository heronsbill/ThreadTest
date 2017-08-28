package com.mxm.thread.interrupt.sleep;

public class MyThread extends Thread{
	@Override
	public void run(){
		super.run();
		try{
			System.out.println("run begin");
			Thread.sleep(2000);
			System.out.println("run end");
		} catch(InterruptedException e){
			System.out.println("�ڳ�˯�б�ֹͣ�� ����Catch!" + Thread.interrupted());
			e.printStackTrace();
		}
	}
}
