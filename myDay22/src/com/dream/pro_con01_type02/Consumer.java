package com.dream.pro_con01_type02;

public class Consumer extends Thread{
	private Phone phone;
	public Consumer() {
	}
	
	public Consumer(Phone phone) {
		this.phone = phone;
	}
	
	@Override
	public void run() {
		while(true){
			synchronized (phone) {
				while(!phone.isStore()) {
					try {
						phone.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(phone.getBrand()+"----"+phone.getPrice());
				phone.setStore(false);
				phone.notifyAll();
			}
		}
		
	}
}
