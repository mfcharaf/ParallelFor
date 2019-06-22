package com.mfcharaf.parallel;

public class Parallel {

	public static volatile Integer I = 0;
	/**
	 * @author A. Charafeddine MEFTAH
	 * @param init : starting value
	 * @param stop : ending value
	 * @param incr : incrementation value
	 * @param run : Implementation of <i><b>IRun</b> interface</i> which  contains the For Loop code block
	 */
	public static void For(int init, int stop, int incr, IRun run) {
		I = init;
		for (I = init; I.intValue() < stop; I += incr) {
			new PThread(I.intValue(), run).start();
		}
	}
	

	public static int i(){
		return I.intValue();
	}
	
}

