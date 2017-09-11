package com.mxm.threads.twoThreadTreadsData;

public class MyThreadA extends Thread{
	private MyList list;
	
	public MyThreadA(String name, MyList list){
		super(name);
		this.list = list;
	}
	
	@Override
	public void run(){
		try {
			for (int i = 0; i < 10; i++){
				list.add();
				System.out.println("����� " + (i + 1) + "��Ԫ��");
				Thread.sleep(1000);
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
