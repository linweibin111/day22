package com.dream.pro_con02_type01;

public class Consumer extends Thread{
	private Store store;
	public Consumer() {
	}
	
	public Consumer(Store store) {
		this.store = store;
	}

	@Override
	public void run() {
		while(true){
			store.pop();
		}
	}
}
