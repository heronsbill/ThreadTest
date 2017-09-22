package com.mxm.lock.lockMethodTest;

import java.util.concurrent.locks.ReentrantLock;

public class MyService2 {
	private ReentrantLock lock;

	public MyService2(boolean isFair) {
		lock = new ReentrantLock(isFair);
	}

	public MyService2() {
		lock = new ReentrantLock();
	}

	public ReentrantLock getLock() {
		return lock;
	}

	public void setLock(ReentrantLock lock) {
		this.lock = lock;
	}
	
	/**
	 * lock.isFair()�ж��Ƿ��ǹ�ƽ��
	 */
	public void isFairMethod(){
		try{
			System.out.println(lock.isFair());
			lock.lock();
			System.out.println(lock.isFair());
		} finally {
			lock.unlock();
		}
	}
	
	/**
	 * lock.isHeldByCurrentThread()�жϵ�ǰ�߳��Ƿ������
	 */
	public void isHeldByCurrentThreadMethod(){
		try {
			System.out.println(lock.isHeldByCurrentThread());
			lock.lock();
			System.out.println(lock.isHeldByCurrentThread());
		} finally {
			lock.unlock();
		}
	}
	
	/**
	 * lock.isLocked()�ж��Ƿ����̳߳�����
	 */
	public void isLockedMethod(){
		try{
			System.out.println(lock.isLocked());
			lock.lock();
			System.out.println(lock.isLocked());
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally{
			lock.unlock();
		}
	}
}
