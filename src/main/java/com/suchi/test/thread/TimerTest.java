package com.suchi.test.thread;

import java.util.Date;
import java.util.TimerTask;

public class TimerTest extends TimerTask{

	@Override
	public void run() {
		System.out.println("timer class started: "+new Date());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("timer class finished: "+new Date());
	}

}
