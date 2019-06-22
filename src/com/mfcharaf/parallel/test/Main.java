package com.mfcharaf.parallel.test;

import com.mfcharaf.parallel.IRun;
import com.mfcharaf.parallel.Parallel;

public class Main {

	public static void main(String[] args) {

		/*
		 * the classic for-loop
		 * 
		 *	for (int i = 0; i < 1000; i++) 
		 *	{
		 *		// your code here
		 *		some_stuff(10);
		 *		System.out.println("Classic For = " + i);
		 *	}
		 */
		

		/*
		 *  the parallel version 
		 */
		
		Parallel.For(0, 1000, 1, new IRun() {
			@Override
			public void run(int i)
			{
				// write your code here
				some_stuff(10);
				System.out.println("PFor = " + i);
			}
		});
		
	}
	
	
	static void some_stuff(long t){
		try {Thread.sleep(t);} catch (InterruptedException e) {}
	}

}
