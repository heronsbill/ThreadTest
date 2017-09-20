package com.mxm.threads.wait_notify_insert_test;

public class AThread extends Thread{
	private DBTools tools;
	
	public AThread(DBTools tools){
		this.tools = tools;
	}
	
	@Override
	public void run(){
		tools.backupA();
	}
}
