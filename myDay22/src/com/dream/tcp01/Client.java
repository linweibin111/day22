package com.dream.tcp01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1",8080);
		//向服务端发送消息
		PrintStream ps=new PrintStream(socket.getOutputStream());
		ps.println("连接成功可吗？");
		
		//接收来自服务端的消息
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		String readLine = br.readLine();
		System.out.println(readLine);
		
		ps.close();
		br.close();
		socket.close();
		
	}

}
