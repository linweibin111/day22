package com.dream.pro_con02_type03;

public class Producter extends Thread{
	private Store store;
	public Producter() {
	}
	public Producter(Store store) {
		this.store = store;
	}
	@Override
	public void run() {
		while(true){
			store.push();
		}
	}
	
}
