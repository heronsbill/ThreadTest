package com.mxm.threads.twoThreadTreadsData;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	private List list = new ArrayList();
	
	public void add(){
		list.add("mxm");
	}
	
	public int getSize(){
		return list.size();
	}
}
