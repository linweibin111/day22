package com.dream.tcp06;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception{
		
		Socket socket = new Socket("127.0.0.1",8080);
		
		Scanner scan=new Scanner(System.in);
		
		//
		PrintStream ps=new PrintStream(socket.getOutputStream());
		
		new ReceiveThread(socket).start();
		
		while(true){
			ps.println("客户端:"+scan.next());
		}

	}

}
