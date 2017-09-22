package com.mxm.lock.p_c_sso;

public class Run {
	public static void main(String[] args) {
		final MyService service = new MyService();
		
		Runnable runnableP = new Runnable(){
			@Override
			public void run(){
				while(true){
					service.producer();
				}
			}
		};
		
		Runnable runnableC = new Runnable(){
			@Override
			public void run(){
				while(true){
					service.consume();
				}
			}
		};
		
		Thread[] threadP = new Thread[5];
		Thread[] threadC = new Thread[5];
		for (int i = 0; i < 5; i++){
			threadP[i] = new Thread(runnableP, "P" + (i+1));
			threadC[i] = new Thread(runnableC, "C" + (i+1));
			threadP[i].start();
			threadC[i].start();
		}
	}
}
