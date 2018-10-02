package yjc.wdb.finalTerm;

import java.net.*;
import java.io.*;
import java.util.*;

public class Q4Client {
	
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1", 7777);
			
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			System.out.println("덧셈을 입력하세요(예 : 45+24) > ");
			Scanner scan = new Scanner(System.in);
			String msg = scan.nextLine();
			
			dos.writeUTF(msg);
			String res = dis.readUTF();
			System.out.println("서버에서 전송된 결과 값: " + res);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try { socket.close(); } catch(Exception ignore) {}
		}
	}

}
