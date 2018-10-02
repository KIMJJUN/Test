package yjc.wdb.finalTest;

import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("홍길동"));
		list.add(new Person("일지매"));
		list.add(new Person("이몽룡"));
		list.add(new Person("성춘향"));
		list.add(new Person("변사또"));
		list.add(new Person("월매"));
		list.add(new Person("향단이"));
		list.add(new Person("방자"));
		list.add(new Person("박문수"));
		list.add(new Person("배트맨"));
		
		PersonComparator comparator = new PersonComparator();
		Collections.sort(list, comparator);
		
		for(Person p : list)
			System.out.println(p);
	}
}
