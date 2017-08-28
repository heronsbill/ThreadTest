package com.mxm.thread.isalive;

public class RunOp {
	public static void main(String[] args) {
		CountOperate op = new CountOperate();
		Thread t1 = new Thread(op);
		System.out.println("main begin op isAlive=" + op.isAlive());
		System.out.println("main begin t1 isAlive=" + t1.isAlive());
		t1.setName("A");
		t1.start();
		System.out.println("main end op isAlive=" + op.isAlive());
		System.out.println("main end t1 isAlive=" + t1.isAlive());
	}
}
