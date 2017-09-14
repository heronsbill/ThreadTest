package com.mxm.threads.waitOld;

public class RemoveThread extends Thread{
	private Object lock;
	
	public RemoveThread(String name, Object obj){
		super(name);
		this.lock = obj;
	}
	
	@Override
	public void run(){
		try{
			synchronized (lock) {
				if (MyArrayList.list.size() == 0){
					System.out.println(Thread.currentThread().getName() + " wait begin");
					lock.wait();
					System.out.println(Thread.currentThread().getName() + " wait end");
				}
				MyArrayList.list.remove(0);
				System.out.println("list size = " + MyArrayList.list.size());
			}
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
