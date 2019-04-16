package com.dream.tcp05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception{
		
		Socket socket = new Socket("127.0.0.1",8080);
		Scanner scan=new Scanner(System.in);
		PrintStream ps=new PrintStream(socket.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		while(true){
			ps.println("客户端:"+scan.next());
			
			String readLine = br.readLine();
			System.out.println(readLine);
		}

	}

}
