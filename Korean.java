package yjc.wdb.finalTest;

public class Korean extends Person {
	private static String msg;
public Korean() {
		super(msg);
	}

public void sayHello(String msg) {
	System.out.println("안녕하세요? " + msg);
	}
}
