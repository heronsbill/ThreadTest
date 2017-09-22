package com.mxm.lock.lockMethodTest;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService3 {
	public ReentrantLock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();
	
	/**
	 * lock.lockInterruptibly()�߳��ڻ�ȡ����ʱ�������ǰ�߳��Ѿ����жϣ������쳣
	 */
	public void lockInterruptiblyMethod(){
		try {
			lock.lockInterruptibly();
			System.out.println("lock begin " + Thread.currentThread().getName());
			for (int i = 0; i < Integer.MAX_VALUE/10; i++){
				String s = new String();
				Math.random();
			}
			System.out.println("lock end " + Thread.currentThread().getName());
		} catch (InterruptedException e){
			System.out.println("lock interrupted " + Thread.currentThread().getName());
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()){
				lock.unlock();
			}
		}
	}
	
	public void normalMethod(){
		try{
			lock.lock();
			System.out.println("lock begin " + Thread.currentThread().getName());
			Thread.sleep(Integer.MAX_VALUE);
			System.out.println("lock end " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()){
				lock.unlock();
			}
		}
	}
	
	/**
	 * lock.tryLock() ���Ի�ȡ�������������У����򣬲��ٳ���
	 */
	public void tryLockMethod(){
		try {
			if (lock.tryLock()){
				System.out.println(Thread.currentThread().getName() + "�������");
				Thread.sleep(1000);
			} else {
				System.out.println(Thread.currentThread().getName() + "δ�������");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()){
				lock.unlock();
			}
		}
	}
	
	/**
	 * lock.tryLock(Long long, TimeUnit unit)��3���ڳ��Ի�ȡ�����ڼ䱻�ж������쳣����ȡ�����ͽ���
	 * ������long = 3
	 *     unit = TimeUnit.SECONDS(��)
	 */
	public void tryLockInTimeMethod(){
		try {
			if (lock.tryLock(3, TimeUnit.SECONDS)){
				System.out.println(Thread.currentThread().getName() + "��3���ڻ������");
				Thread.sleep(2000);
			} else {
				System.out.println(Thread.currentThread().getName() + "��3����δ�������");
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + "��3���ڱ��жϣ�");
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()){
				lock.unlock();
			}
		}
	}
	
	public void awaitMethod(){
		try{
			lock.lock();
			System.out.println("wait begin");
			condition.await();
			System.out.println("wait end");
		} catch (InterruptedException e){
			System.out.println("����˭�����ж��ˣ�");
			e.printStackTrace();
		} finally {
			System.out.println("await �������� " + lock.isHeldByCurrentThread());
			if (lock.isHeldByCurrentThread()){
				lock.unlock();
			}
		}
	}
	
	/**
	 * lock.awaitUninterrutibly()�ȴ��ڼ䱻�ж�,�ٴλ�ȡ����ʱ�������쳣
	 */
	public void awaitUninterruptiblyMethod(){
		try {
			lock.lock();
			condition.awaitUninterruptibly();
		} finally {
			if (lock.isHeldByCurrentThread()){
				lock.unlock();
			}
		}
	}
	
	/**
	 * lock.awaitUntil(Date date)�ڵ���dateʱ��󣬻��Զ������Լ�
	 */
	public void awaitUntilMethod(){
		try {
			lock.lock();
//			Calendar calendar = Calendar.getInstance();
//			calendar.add(Calendar.SECOND, 2);
			long now = System.currentTimeMillis();
			Date date = new Date(now + 2000);
			System.out.println("wait begin time = " + System.currentTimeMillis());
			condition.awaitUntil(date);
			System.out.println("wait end time = " + System.currentTimeMillis());
		} catch (InterruptedException e){
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
