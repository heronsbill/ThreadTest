package com.mxm.synchronize.synOutAsyn;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	private List list = new ArrayList();
	
	public synchronized void add(String userName){
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "ִ����add����");
		list.add(userName);
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "�˳���add����");
	}
	
	public synchronized int getSize(){
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "ִ����getSize����");
		int size = list.size();
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "�˳���getSize����");
		return size;
	}
}
