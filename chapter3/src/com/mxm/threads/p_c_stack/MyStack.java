package com.mxm.threads.p_c_stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	private List<String> list = new ArrayList<String>();
	
	synchronized public void push(){
		try {
			while (list.size() >= 1){
				this.wait();
			}
			String value = "anyString=" + Math.random();
			list.add(value);
			this.notifyAll();
			System.out.println("push=" + list.size());
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	
	synchronized public void pop(){
		try {
			while (list.size() == 0){
				System.out.println("pop操作中的："
						+ Thread.currentThread().getName() + "线程呈wait状态");
				this.wait();
			}
			String value = list.get(0);
			list.remove(0);
			this.notifyAll();
			System.out.println("pop value=" + value + " pop size=" + list.size());
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
