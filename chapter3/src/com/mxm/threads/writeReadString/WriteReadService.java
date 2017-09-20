package com.mxm.threads.writeReadString;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class WriteReadService {
	public static void writeData(PipedWriter writer, String s){
		try {
			System.out.println("write :" + s);
			writer.write(s);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readData(PipedReader reader){
		System.out.println("read :");
		char[] cs = new char[20];
		int readLength = 0;
		try {
			while((readLength = reader.read(cs)) != -1){
				System.out.print(new String(cs, 0, readLength));
			}
			System.out.println();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		PipedWriter writer = new PipedWriter();
		PipedReader reader = new PipedReader();
		
		try {
			writer.connect(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String s = "mxm";
		writeData(writer, s);
		readData(reader);
	}
}
