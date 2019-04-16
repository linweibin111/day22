package com.dream.pro_con02_type02;

import javax.crypto.Cipher;

public class Test01 {
	public static void main(String[] args) {
		Store store = new Store();
		Producter p1 = new Producter(store);
		Producter p2 = new Producter(store);
		
		Consumer c1 = new Consumer(store);
		Consumer c2 = new Consumer(store);
		
		p1.start();
		p2.start();
		c1.start();
		c2.start();
	}
}
