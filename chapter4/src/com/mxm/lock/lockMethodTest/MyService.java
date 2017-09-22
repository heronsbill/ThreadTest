package com.mxm.lock.lockMethodTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Xiaoming.Ma
 *
 */
public class MyService {
	public ReentrantLock lock = new ReentrantLock();
	
	/**
	 * lock.getHoldCount():��ȡ��ǰ�̱߳��ִ������ĸ�������lock()�����Ĵ���
	 */
	public void holdCountService1(){
		try{
			lock.lock();
			System.out.println("holdCountService1 getHoldCount="
					+ lock.getHoldCount());
			holdCountService2();
		} finally {
			lock.unlock();
		}
	}
	
	public void holdCountService2(){
		try{
			lock.lock();
			System.out.println("holdCountService2 getHoldCount="
					+ lock.getHoldCount());
		} finally {
			lock.unlock();
		}
	}
	
	/**
	 * lock.getQueueLength()��õȴ����Ľ�����
	 */
	public void queueLengthService(){
		try{
			lock.lock();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "���뷽����");
			Thread.sleep(Integer.MAX_VALUE);;
		} catch (InterruptedException e){
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public Condition condition = lock.newCondition();
	/**
	 * lock.getWaitQueueLength(condition)��ȡ�ȴ�condition֪ͨ�Ľ�����
	 * lock.hasWaiters(condition)�ж��Ƿ����߳��ڵȴ�condition֪ͨ
	 */
	public void waitQueueLengthService(){
		try{
			lock.lock();
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void signalAllService(){
		try{
			lock.lock();
			System.out.println("���߳�����" + lock.getWaitQueueLength(condition) 
					+ "��condition��wait״̬");
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	public void signalAllService2(){
		try{
			lock.lock();
			System.out.println("��û���߳��ڵȴ�condition��" + lock.hasWaiters(condition)
					+ "�ж����߳�����" + lock.getWaitQueueLength(condition));
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	/**
	 * lock.hasQueueThread(thread)�ж��߳�thread�Ƿ��ڵȴ���ȡ��lock
	 * lock.hasQueueThreads()�ж��Ƿ����߳��ڵȴ���ȡ��lock
	 */
	public void queueThreadService(){
		try{
			lock.lock();
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally{
			lock.unlock();
		}
	}
}
