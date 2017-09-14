package com.mxm.threads.watiNotifySize5;

import com.mxm.threads.twoThreadTreadsData.MyList;

public class MyThreadA extends Thread{
	private MyList list;
	
	public MyThreadA(MyList list){
		this.list = list;
	}
	
	@Override
	public void run(){
		synchronized (list) {
			for (int i = 0; i < 10; i++){
				System.out.println("新增了" + (i+1) + "个元素");
				list.add();
				if (list.getSize() == 5){
					System.out.println("已发出通知");
					list.notify();
				}
			}
		}
	}
}
