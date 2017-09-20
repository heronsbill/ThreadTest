package com.mxm.threads.wait_notify_insert_test;

public class Run {
	public static void main(String[] args) {
		DBTools tools = new DBTools();
		
		AThread[] at = new AThread[20];
		BThread[] bt = new BThread[20];
		
		for (int i = 0; i < 20; i++){
			at[i] = new AThread(tools);
			bt[i] = new BThread(tools);
		}
		
		for (int i = 0; i < 20; i++){
			at[i].start();
		}
		for (int i = 0; i < 20; i++){
			bt[i].start();
		}
	}
}
