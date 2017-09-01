package com.mxm.synchronize.synBlockString;

public class Service {
	private String userName;
	private int userAge;
	private String lockString = new String();
	
	public void setUser(String userName, int userAge){
		try{
			synchronized(lockString){
				System.out.println("线程名称为：" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "进入同步块");
				this.userName = userName;
				Thread.sleep(3000);
				this.userAge = userAge;
				System.out.println("线程名称为：" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "退出同步块");
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public synchronized void synMethod(){
		try{
			System.out.println("线程名称为：" + Thread.currentThread().getName()
					+ "在" + System.currentTimeMillis() + "进入同步块");
			Thread.sleep(2000);
			System.out.println("线程名称为：" + Thread.currentThread().getName()
					+ "在" + System.currentTimeMillis() + "退出同步块");
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
