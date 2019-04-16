package com.dream.tcp03;

import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(8080);
		Socket socket = server.accept();
		
		//接收来自客户端的User对象
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		User user = (User) ois.readObject();
		System.out.println(user);
		
		
		//3.向客户端发送注册结果
		PrintStream ps=new PrintStream(socket.getOutputStream());
		ps.println("1");
		
	}
}
