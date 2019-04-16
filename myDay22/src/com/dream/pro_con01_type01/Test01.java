package com.dream.pro_con01_type01;

public class Test01 {

	public static void main(String[] args) {
		Phone phone = new Phone();
		Producter p = new Producter(phone);
		Consumer c = new Consumer(phone);
		
		p.start();
		c.start();

	}

}
