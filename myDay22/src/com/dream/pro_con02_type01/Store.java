package com.dream.pro_con02_type01;

public class Store {
	private int max=20;//最大容量
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
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.notify();
		}
	}
	
	public void pop(){
		synchronized (this) {
			if (num<=0) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			num--;
			System.out.println("商品出库:"+num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.notify();
		}
	}
}
