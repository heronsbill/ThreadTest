package com.mxm.synchronize.synLockChange;

public class ObjectLockService {
	static class User{
		private String userName;
		private Integer userAge;
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public Integer getUserAge() {
			return userAge;
		}
		public void setUserAge(Integer userAge) {
			this.userAge = userAge;
		}
	}
	
	User user = new User();
	public void testMethod(){
		synchronized (user) {
			System.out.println(Thread.currentThread().getName() + " begin "
					+ System.currentTimeMillis());
			user.setUserName("BBB");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " end "
					+ System.currentTimeMillis());
		}
	}
}
