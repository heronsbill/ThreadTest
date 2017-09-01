package com.mxm.synchronize.synBlockString;

public class Service {
	private String userName;
	private int userAge;
	private String lockString = new String();
	
	public void setUser(String userName, int userAge){
		try{
			synchronized(lockString){
				System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName()
						+ "��" + System.currentTimeMillis() + "����ͬ����");
				this.userName = userName;
				Thread.sleep(3000);
				this.userAge = userAge;
				System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName()
						+ "��" + System.currentTimeMillis() + "�˳�ͬ����");
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public synchronized void synMethod(){
		try{
			System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName()
					+ "��" + System.currentTimeMillis() + "����ͬ����");
			Thread.sleep(2000);
			System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName()
					+ "��" + System.currentTimeMillis() + "�˳�ͬ����");
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
