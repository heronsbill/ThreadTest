package com.mxm.synchronize.synNotExtends;

public class Sub extends Main{
	@Override
	public void testMethod(){
		try{
			System.out.println("int sub 下一步sleep begin threadName= "
					+ Thread.currentThread().getName() + " time = "
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int sub 下一步sleep end threadName= "
					+ Thread.currentThread().getName() + " time = "
					+ System.currentTimeMillis());
			super.testMethod();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
}
