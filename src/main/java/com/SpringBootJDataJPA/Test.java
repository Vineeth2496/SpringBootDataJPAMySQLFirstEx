package com.SpringBootJDataJPA;

public class Test<T> {
	public void show(T input) {
		System.out.println(input);
	}
	
	public static void main(String[] args) {
		Test<String> t1=new Test<>();
		t1.show("Dude");
		
		Test<Integer> t2=new Test<>();
		t2.show(20);
	}
}
