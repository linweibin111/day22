package com.dream.tcp04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception{
		
		Socket socket = new Socket("127.0.0.1",8080);
		
		//向客户端发送文件
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Day22_7_TCP.avi"));
		BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream()); 
		byte[] bs=new byte[1024];
		int len;
		while((len=bis.read(bs))!=-1){
			bos.write(bs, 0, len);
			
		}
		
		bis.close();
		bos.close();
		socket.close();
		

	}

}
