package com.dream.tcp06;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws Exception{

		Scanner scan=new Scanner(System.in);
		ServerSocket server = new ServerSocket(8080);
		Socket socket = server.accept();
		
		//想客户端发送消息
		PrintStream ps=new PrintStream(socket.getOutputStream());
		//一直接收消息
		new ReceiveThread(socket).start();
		
		while(true){
			ps.println("服务器:"+scan.next());
		}

	}

}
