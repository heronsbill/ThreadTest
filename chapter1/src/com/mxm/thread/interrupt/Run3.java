package com.mxm.thread.interrupt;

public class Run3 {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("�Ƿ�ֹͣ1��=" + Thread.currentThread().isInterrupted());
		System.out.println("�Ƿ�ֹͣ2��=" + Thread.currentThread().isInterrupted());
		System.out.println("end!");
	}
}
