package com.mxm.lock.readWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyService {
	public ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void read(){
		try {
			lock.readLock().lock();
			System.out.println("��ö���" + Thread.currentThread().getName()
					+ " " + System.currentTimeMillis());
			Thread.sleep(10000);
		} catch (InterruptedException e){
			e.printStackTrace();
		} finally {
			lock.readLock().unlock();
		}
	}
	
	public void write(){
		try {
			lock.writeLock().lock();
			System.out.println("���д��" + Thread.currentThread().getName()
					+ " " + System.currentTimeMillis());
			Thread.sleep(10000);
		} catch (InterruptedException e){
			e.printStackTrace();
		} finally {
			lock.writeLock().unlock();
		}
	}
}
