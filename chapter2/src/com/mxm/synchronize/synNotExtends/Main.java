package com.mxm.synchronize.synNotExtends;

public class Main {
	synchronized public void testMethod(){
		try{
			System.out.println("int main 下一步sleep begin threadName= "
					+ Thread.currentThread().getName() + " time = "
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int main 下一步sleep end threadName= "
					+ Thread.currentThread().getName() + " time = "
					+ System.currentTimeMillis());
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
