package com.mxm.threads.joinTest;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.run();
		try {
			thread.join();
			System.out.println("������thread���������ִ�У��������ˣ�");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
