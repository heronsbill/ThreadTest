package com.mxm.thread.interrupt;

public class Run1 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		try{
			mt.start();
			Thread.sleep(1000);
//			mt.interrupt();
			Thread.currentThread().interrupt();
			System.out.println("ÊÇ·ñÍ£Ö¹1£¿=" + mt.interrupted());
			System.out.println("ÊÇ·ñÍ£Ö¹2£¿=" + mt.interrupted());
		} catch(InterruptedException e){
			System.out.println("main catch");
			e.printStackTrace();
		}
	}

}
