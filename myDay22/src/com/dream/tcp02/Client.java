package com.dream.tcp02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception{
		
		Socket socket = new Socket("127.0.0.1", 8080);
		Scanner scan=new Scanner(System.in);
		
		System.out.println("请输入账号:");
		String id=scan.next();
		System.out.println("请输入密码:");
		String pwd=scan.next();
		
		//向服务器发送数据
		PrintStream ps=new PrintStream(socket.getOutputStream());
		ps.println(id);
		ps.println(pwd);
		
		//接收来自服务器返回的登录状态吗
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		String readLine = br.readLine();
		if ("1".equals(readLine)) {
			System.out.println("登陆成功");
		}else if("0".equals(readLine)){
			System.out.println("登陆失败");
		}
		

	}

}
