package com.mxm.lock.lockMethodTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AwaitUntilTestRun {
	public static void main(String[] args) {
		final MyService3 service = new MyService3();
		
		Thread thread = new Thread(){
			@Override
			public void run(){
				service.awaitUntilMethod();
			}
		};
		thread.start();
		
//		long now = System.currentTimeMillis();
//		Date date = new Date(now);
//		Date date1 = new Date(now + 2000);
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
//		System.out.println(df.format(date));
//		System.out.println(df.format(date1));
	}
}
