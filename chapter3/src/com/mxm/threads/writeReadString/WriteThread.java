package com.mxm.threads.writeReadString;

import java.io.PipedWriter;

public class WriteThread extends Thread{
	private PipedWriter writer;
	
	public WriteThread(PipedWriter writer){
		this.writer = writer;
	}
	
	@Override
	public void run(){
		String s = "";
		for (int i = 0; i < 30; i++){
			s += i;
		}
		WriteReadService.writeData(writer, s);
	}
}
