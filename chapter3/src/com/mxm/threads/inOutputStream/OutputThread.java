package com.mxm.threads.inOutputStream;

import java.io.PipedOutputStream;

public class OutputThread extends Thread{
	private PipedOutputStream output;
	
	public OutputThread(PipedOutputStream output){
		this.output = output;
	}
	
	@Override
	public void run(){
		String ss = "";
		for (int i = 0; i < 30; i++){
			ss += i;
		}
		InOutService.writeData(output, ss.getBytes());
	}
}
