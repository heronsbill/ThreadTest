package com.mxm.threads.twoThreadTreadsData;

public class MyThreadB extends Thread{
	private MyList list;
	private String count = "0";
	
	public MyThreadB(String name, MyList list){
		super(name);
		this.list = list;
	}
	
	public String getCount(){
		return count;
	}
	
	@Override
	public void run(){
		try{
			while (true){
//				count += "-" + list.getSize();
				if (list.getSize() == 5){
					System.out.println(Thread.currentThread().getName() + "ÒªÍË³öÁË");
					throw new InterruptedException();
				}
				
//				if (list.getSize() >= 10){
//					throw new InterruptedException();
//				}
//				Thread.sleep(1000);
			}
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
