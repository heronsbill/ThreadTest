package com.mxm.threads.writeReadString;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Run {
	public static void main(String[] args) {
		PipedReader reader = new PipedReader();
		PipedWriter writer = new PipedWriter();
		
		ReadThread rt = new ReadThread(reader);
		WriteThread wt = new WriteThread(writer);
		
		try {
			reader.connect(writer);
			rt.start();
			
			Thread.sleep(1000);
			
			wt.start();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
