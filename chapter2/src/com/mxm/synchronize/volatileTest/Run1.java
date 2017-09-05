package com.mxm.synchronize.volatileTest;

public class Run1 {
	public static void main(String[] args) {
		PringStringThread printStringService = new PringStringThread();
		new Thread(printStringService).start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("ÎÒÒªÍ£Ö¹Ëü£¡stopThread="
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}
}
