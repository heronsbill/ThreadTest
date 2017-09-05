package com.mxm.synchronize.volatileTest;

public class PrintString {
	private boolean isContinuePrint = true;
	public void setContinuePrint(boolean isContinuePrint){
		this.isContinuePrint = isContinuePrint;
	}
	public boolean isContinuePrint(){
		return isContinuePrint;
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
}
