package com.mxm.threadlocal.test;

public class Run {
	public static ThreadLocal tl = new ThreadLocal();
	
	public static void main(String[] args) {
		tl.set("ÎÒµÄ³õÖµ");
		System.out.println(tl.get());
	}
}
