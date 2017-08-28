package com.mxm.thread.interrupt;

public class Run3 {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("ÊÇ·ñÍ£Ö¹1£¿=" + Thread.currentThread().isInterrupted());
		System.out.println("ÊÇ·ñÍ£Ö¹2£¿=" + Thread.currentThread().isInterrupted());
		System.out.println("end!");
	}
}
