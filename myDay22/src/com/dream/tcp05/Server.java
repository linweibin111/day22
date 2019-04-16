package com.dream.tcp05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws  Exception{
		ServerSocket server = new ServerSocket(8080);
		Socket socket = server.accept();
		
		Scanner scan=new Scanner(System.in);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		PrintStream ps=new PrintStream(socket.getOutputStream());
		
		while(true){
			String readLine = br.readLine();
			System.out.println(readLine);
			
			ps.println("服务器:"+scan.next());
		}
		
		
		

	}

}
