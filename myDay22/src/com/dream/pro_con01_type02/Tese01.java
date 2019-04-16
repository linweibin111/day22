package com.dream.pro_con01_type02;

public class Tese01 {
	public static void main(String[] args) {
		Phone phone = new Phone();
		Producter p1 = new Producter(phone);
		Producter p2 = new Producter(phone);
		Consumer c1 = new Consumer(phone);
		Consumer c2 = new Consumer(phone);
		
		p1.start();
		p2.start();
		c1.start();
		c2.start();
		
	}
}
