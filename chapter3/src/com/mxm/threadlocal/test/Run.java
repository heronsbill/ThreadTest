package com.mxm.threadlocal.test;

public class Run {
	public static ThreadLocal tl = new ThreadLocal();
	
	public static void main(String[] args) {
		tl.set("�ҵĳ�ֵ");
		System.out.println(tl.get());
	}
}
