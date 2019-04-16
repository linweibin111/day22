package com.dream.pro_con02_type01;

public class Test01 {
	public static void main(String[] args) {
		Store store = new Store();
		Producter p = new Producter(store);
		Consumer c = new Consumer(store);
		
		p.start();
		c.start();
		
	}
}
