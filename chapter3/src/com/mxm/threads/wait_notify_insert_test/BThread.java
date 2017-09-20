package com.mxm.threads.wait_notify_insert_test;

public class BThread extends Thread{
	private DBTools tools;
	
	public BThread(DBTools tools){
		this.tools = tools;
	}
	
	@Override
	public void run(){
		tools.backupB();
	}
}
