package com.mxm.threads.wait_notify_insert_test;

public class DBTools {
	volatile private boolean prevIsA = false;

	synchronized public void backupA() {
		try {
			while (prevIsA) {
				wait();
			}
			for (int i = 0; i < 5; i++){
				System.out.println("¡î¡î¡î¡î¡î¡î¡î¡î¡î¡î¡î¡î¡î¡î");
			}
			prevIsA = true;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized public void backupB(){
		try {
			while (!prevIsA) {
				wait();
			}
			for (int i = 0; i < 5; i++){
				System.out.println("¡ï¡ï¡ï¡ï¡ï¡ï¡ï¡ï¡ï¡ï¡ï¡ï¡ï¡ï");
			}
			prevIsA = false;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
