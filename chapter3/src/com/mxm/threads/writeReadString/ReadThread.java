package com.mxm.threads.writeReadString;

import java.io.PipedReader;

public class ReadThread extends Thread{
	private PipedReader reader;
	
	public ReadThread(PipedReader reader){
		this.reader = reader;
	}
	
	@Override
	public void run(){
		WriteReadService.readData(reader);
	}
}
