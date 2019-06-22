package com.mfcharaf.parallel;

class PThread extends Thread {
	
	private int i;
	private IRun r;

	public PThread(int i, IRun r) {
		this.r = r;
		this.i = i;
	}

	@Override
	public void run() {
		r.run(i);
	}

}
