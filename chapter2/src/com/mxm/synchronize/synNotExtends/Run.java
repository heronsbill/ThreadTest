package com.mxm.synchronize.synNotExtends;

public class Run {
	static class MyThread implements Runnable{
		private Sub sub;
		
		public void setSub(Sub sub){
			this.sub = sub;
		}
		@Override
		public void run(){
			sub.testMethod();
		}
	}
	public static void main(String[] args) {
		Sub sub = new Sub();
		MyThread threadA = new Run.MyThread();
		MyThread threadB = new Run.MyThread();
		
		threadA.setSub(sub);
		threadB.setSub(sub);
		
		Thread thread1 = new Thread(threadA, "A");
		Thread thread2 = new Thread(threadB, "B");
		
		thread1.start();
		thread2.start();
	}
}
