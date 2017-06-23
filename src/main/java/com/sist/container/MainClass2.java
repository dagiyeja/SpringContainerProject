package com.sist.container;

class A{
	public A(){
		System.out.println("按眉 积己!");
	}

	//家戈磊
	protected void finalize() throws Throwable {
		System.out.println("按眉 家戈!"); //按眉甫 家戈窍妨搁 gc甫 龋免秦具
	}
	
}

public class MainClass2 {

	public static void main(String[] args) {
		A a=new A();
		//劝侩
		//家戈
		a=null;
		System.gc();

	}

}
