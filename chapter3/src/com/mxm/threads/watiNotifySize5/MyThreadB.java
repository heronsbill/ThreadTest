package com.mxm.threads.watiNotifySize5;

import com.mxm.threads.twoThreadTreadsData.MyList;

public class MyThreadB extends Thread{
	private MyList list;
	
	public MyThreadB(MyList list){
		this.list = list;
	}
	
	@Override
	public void run(){
		try{
			synchronized (list) {
				if (list.getSize() == 5){
					throw new InterruptedException();
				} else{
					System.out.println("wait begin time=" + System.currentTimeMillis());
					list.wait();
					System.out.println("wait end time=" + System.currentTimeMillis());
				}
			}
		} catch(InterruptedException e){
			System.out.println("我要退出了");
			e.printStackTrace();
		}
	}
}
