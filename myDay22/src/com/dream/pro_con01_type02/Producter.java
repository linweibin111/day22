package com.dream.pro_con01_type02;

public class Producter extends Thread{
	private Phone phone;
	private static boolean flag=true;
	public Producter() {
	}
	
	public Producter(Phone phone) {
		this.phone = phone;
	}
	
	
	@Override
	public void run() {
		while(true){
			synchronized (phone) {
				while(phone.isStore()){
					try {
						phone.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (flag) {
					phone.setBrand("华为");
					phone.setPrice(3999);
				}else {
					phone.setBrand("小米");
					phone.setPrice(1999);
				}
				flag=!flag;
				phone.setStore(true);
				
				phone.notifyAll();
			}
		}
	}

}
