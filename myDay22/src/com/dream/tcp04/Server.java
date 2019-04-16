package com.dream.tcp04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(8080);
		Socket socket = server.accept();
		//接收来自客户端的文件
		BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.avi"));
		byte[] bs=new byte[1024];
		int len;
		while((len=bis.read(bs))!=-1){
			bos.write(bs, 0, len);
		}
		
		bis.close();
		bos.close();
		socket.close();
		server.close();
		

	}

}
