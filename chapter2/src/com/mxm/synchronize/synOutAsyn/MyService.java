package com.mxm.synchronize.synOutAsyn;

public class MyService {
	public MyList addMethod(MyList list, String data){
		if (list.getSize() < 1){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list.add(data);
		}
		return list;
	}
}
