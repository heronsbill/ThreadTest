package com.mxm.synchronize.task;

public class Task {
	private String getData1;
	private String getData2;
	
	public synchronized void doLongTimeTask(){
		try{
			System.out.println("begin task");
			Thread.sleep(3000);
			getData1 = "��ʱ�䴦��������Զ�̷��ص�ֵ1 threadName="
					+ Thread.currentThread().getName();
			getData2 = "��ʱ�䴦��������Զ�̷��ص�ֵ2 threadName="
					+ Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public void doLongTimeTask2(){
		try{
			System.out.println("begin task");
			Thread.sleep(3000);
			String data1 = "��ʱ�䴦��������Զ�̷��ص�ֵ1 threadName="
					+ Thread.currentThread().getName();
			String data2 = "��ʱ�䴦��������Զ�̷��ص�ֵ2 threadName="
					+ Thread.currentThread().getName();
			synchronized(this){
				getData1 = data1;
				getData2 = data2;
				System.out.println(getData1);
				System.out.println(getData2);
			}
			System.out.println("end task");
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
