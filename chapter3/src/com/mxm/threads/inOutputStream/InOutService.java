package com.mxm.threads.inOutputStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class InOutService {
	public static void writeData(PipedOutputStream output, byte[] bytes){
		try {
			System.out.println("write :" + new String(bytes));
			output.write(bytes);
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readData(PipedInputStream input){
		System.out.println("read :");
		byte[] bytes = new byte[20];
		int readLength = 0;
		try {
			String data = "";
			while ((readLength = input.read(bytes)) != -1){
				data = new String(bytes, 0, readLength);
				System.out.print(data);
			}
			System.out.println();
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		PipedOutputStream output = new PipedOutputStream();
		PipedInputStream input = new PipedInputStream();
		try {
			input.connect(output);
			String s = new String("mxm");
			byte[] bytes = s.getBytes();
			writeData(output, bytes);
			readData(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
