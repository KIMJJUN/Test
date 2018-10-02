package yjc.wdb.finalTest;

public class American extends Person {
	private static String msg;
	public American() {
		super(msg);
	}

	public void sayHello(String msg) {
		System.out.println("Hello? " + msg);
		}
}
