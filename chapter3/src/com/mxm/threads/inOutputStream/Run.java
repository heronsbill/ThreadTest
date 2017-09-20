package com.mxm.threads.inOutputStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {
	public static void main(String[] args) {
		PipedInputStream in = new PipedInputStream();
		PipedOutputStream out = new PipedOutputStream();
		
		InputThread inThread = new InputThread(in);
		OutputThread outThread = new OutputThread(out);
		
		try {
			in.connect(out);
			inThread.start();
			
			Thread.sleep(1000);
			
			outThread.start();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
