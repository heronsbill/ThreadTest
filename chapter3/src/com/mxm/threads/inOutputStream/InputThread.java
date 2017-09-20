package com.mxm.threads.inOutputStream;

import java.io.PipedInputStream;

public class InputThread extends Thread{
	private PipedInputStream input;
	
	public InputThread(PipedInputStream input){
		this.input = input;
	}
	
	@Override
	public void run(){
		InOutService.readData(input);
	}
}
