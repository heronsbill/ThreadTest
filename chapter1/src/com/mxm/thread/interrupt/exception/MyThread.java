package com.mxm.thread.interrupt.exception;

public class MyThread extends Thread{
	@Override
	public void run(){
		super.run();
		try{
			for (int i = 0; i < 500000; i++){
				if (Thread.interrupted()){
					System.out.println("��Ҫ�˳���");
					throw new InterruptedException();
				}
				System.out.println("��" + i + "��");
			}
			System.out.println("�һ��ڼ�������");
		} catch(InterruptedException e){
			System.out.println("My Thread catch");
			e.printStackTrace();
		}
	}

}
