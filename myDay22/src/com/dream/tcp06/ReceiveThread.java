package com.dream.tcp06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class ReceiveThread extends Thread{
	
	BufferedReader br ;
	public ReceiveThread() {		
	}	
	public ReceiveThread(Socket socket) {
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
	@Override
	public void run() {
		while(true){
			String readLine;
			try {
				readLine = br.readLine();
				System.out.println(readLine);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}		
	}
	
	
	

}
