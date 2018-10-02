package yjc.wdb.finalTest;

public class Q1 {

	public static void main(String[] args) {
		Person p = new Korean();
		p.sayHello("홍길동");
		
		p = new American();
		p.sayHello("홍길동");
	}

}
