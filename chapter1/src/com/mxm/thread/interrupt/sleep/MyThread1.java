package com.mxm.thread.interrupt.sleep;

public class MyThread1 extends Thread{
	@Override
	public void run(){
		for (int i = 0; i < 10000; i++){
			System.out.println("��" + i + "��");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("��ֹͣ����sleep������Catch��" + this.isInterrupted());
			e.printStackTrace();
		}
	}
}
