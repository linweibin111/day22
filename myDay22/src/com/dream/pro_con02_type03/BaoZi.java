package com.dream.pro_con02_type03;

import java.text.SimpleDateFormat;

public class BaoZi {
	private int num;
	private long time;
	public BaoZi() {
	}
	public BaoZi(int num, long time) {
		this.num = num;
		this.time = time;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		return "包子编号" + num + ", 生产时间---" + sdf.format(this.time);
	}
	
	
	
	
	
	
}
