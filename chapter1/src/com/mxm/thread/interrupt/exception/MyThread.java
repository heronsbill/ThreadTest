package com.mxm.thread.interrupt.exception;

public class MyThread extends Thread{
	@Override
	public void run(){
		super.run();
		try{
			for (int i = 0; i < 500000; i++){
				if (Thread.interrupted()){
					System.out.println("我要退出了");
					throw new InterruptedException();
				}
				System.out.println("第" + i + "行");
			}
			System.out.println("我还在继续运行");
		} catch(InterruptedException e){
			System.out.println("My Thread catch");
			e.printStackTrace();
		}
	}

}
