package yjc.wdb.finalTest;

import java.io.*;

public class Q3 {

	public static void main(String[] args) {
		File file = new File("wc.txt");
		try {
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		int s = 0;
		while((s=br.read())!=-1) {
			char c = (char)s;
			System.out.print(c);
		}
		}catch(Exception e) {
			
		}

	}
}
