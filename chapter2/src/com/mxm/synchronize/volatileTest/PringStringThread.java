package com.mxm.synchronize.volatileTest;

public class PringStringThread implements Runnable{
	private boolean isContinuePrint = true;
	public void setContinuePrint(boolean isContinuePrint){
		this.isContinuePrint = isContinuePrint;
	}
	
	public void printStringMethod(){
		try{
			while (isContinuePrint){
				System.out.println("run PrintStringMethod ThreadName="
						+ Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		printStringMethod();
	}

}
