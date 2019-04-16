package com.dream.tcp01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {
		//开启服务
		System.out.println("开启服务器成功");
		ServerSocket server = new ServerSocket(8080);
		//接收请求
		Socket socket = server.accept();
		System.out.println("已接受客户端请求");
		//接收来自客户端的消息
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		String readLine = br.readLine();
		System.out.println(readLine);
		
		//向客户端发送消息
		PrintStream ps=new PrintStream(socket.getOutputStream());
		ps.println("已连接服务器......");
		
		br.close();
		ps.close();
		socket.close();
		
		
		
	}

}
