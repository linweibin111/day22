package com.dream.pro_con02_type02;

public class Store {
	private int max=20;
	private int num=0;
	
	
	public void push(){
		synchronized (this) {
			if (num>=max) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			num++;
			System.out.println("商品入库:"+num);
			this.notifyAll();
		}
	}
	
	public void pop(){
		synchronized (this) {
			if (num<=0) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			num--;
			System.out.println("商品出库"+num);
			this.notifyAll();
		}
	}
	
	
}
