package com.mxm.threadlocal.initTest;

import com.mxm.threadlocal.tool.ThreadLocalExt;

public class Run {
	public static ThreadLocalExt tle = new ThreadLocalExt();
	
	public static void main(String[] args) {
		if (tle.get() == null){
			System.out.println("û�г�ֵ");
			tle.set("chuzhi");
		}
		System.out.println(tle.get());
	}
}
