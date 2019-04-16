package com.dream.tcp03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception{
		
		Socket socket = new Socket("127.0.0.1", 8080);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入账号:");
		String id=scan.next();
		System.out.println("请输入密码:");
		String pwd = scan.next();
		System.out.println("请输入确认密码:");
		String rpwd = scan.next();
		System.out.println("请输入性别:");
		String sex=scan.next();
		System.out.println("请输入年龄:");
		int age = scan.nextInt();
		
		//给服务器发送数据
		if (!pwd.equals(rpwd)) {
			System.out.println("两次密码不一致");
		}else{
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(new User(id, pwd, sex.charAt(0), age));
		}
		
		//接收服务器返回的注册状态码
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		String readLine = br.readLine();
		if ("1".equals(readLine)) {
			System.out.println("注册成功");
		}
		
		
		
		
	}
}
