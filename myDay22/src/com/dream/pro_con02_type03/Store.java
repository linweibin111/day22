package com.dream.pro_con02_type03;

import java.util.LinkedList;

public class Store {

	private int max=20;//最大库存
	private int num=0;//货物数量
	private LinkedList<BaoZi> list=new LinkedList<>();
	private int baoZiNum=1;//包子编号
	
	public void push(){
		synchronized (this) {
			while(num>=max){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			num++;
			System.out.println("商品入库"+num);
			list.add(new BaoZi(baoZiNum++, System.currentTimeMillis()));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.notifyAll();
			
		}
	}
	
	public void pop(){
		synchronized (this) {
			while(num<=0){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			num--;
			System.out.println("商品出库:"+num);
			BaoZi baoZi=list.removeFirst();
			System.out.println(baoZi);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.notify();
			
			
			
			
		}
	}
	
	
	
	
}
