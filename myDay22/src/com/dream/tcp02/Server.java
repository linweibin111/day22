package com.dream.tcp02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception{
		
		//
		ServerSocket server = new ServerSocket(8080);
		Socket socket = server.accept();
		
		//接收客户端发送的数据
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		String id = br.readLine();
		String pwd=br.readLine();
		
		//判断账号密码
		boolean bool=false;
		if ("asd".equals(id) && "123".equals(pwd)) {
			bool=true;
		}
		
		//向客户端发送登录结果
		PrintStream ps=new PrintStream(socket.getOutputStream());
		if (bool) {
			ps.println("1");
		}else {
			ps.println("0");
		}
		

	}

}
