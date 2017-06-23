package com.sist.sawon;
/*
 * 	멤버변수의 초기값 부여
 * 	=> setter
 * 	=> 생성자
 * 	=> static 블럭, 인스턴스 블럭
 * 	class A
 * 	{
 * 		int a=10;  0=>10=>20=>30
 * 		{
 * 			a=20;	//file 읽기
 * 		}
 * 		public A()
 * 		{
 * 			a=30;
 * 		}
 * 	}
 * 
 * 	A a=new A();
 * 	A.this=a; //JVM 에서 this객체 생성
 * 
 * 	자바 메모리 구조
 * 	====================
 * 	Method 영역
 * 	static 
 * 		=data 초기화 전 static int a;
 * 		=data 초기화	  static ina a=10;
 * 	====================
 * 	Stack 영역	=> 메모리 관리
 * 	====================
 * 	Heap 영역	=> 프로그래머	==>gc
 * 		near heap
 * 		far heap
 * 	====================
 * 
 * 	 class A
 * 		int a;
 * 
 * 	A aa=new A();
 * 		aa : Stack에 저장		a 	heap 
 * */
public class Sawon2 {
	private int sabun;
	private String name;
	private String dept;
	public Sawon2(int sabun, String name, String dept){
		this.sabun=sabun;
		this.name=name;
		this.dept=dept;
	}
	
	public void print(){
		System.out.println("사번 :"+sabun);
		System.out.println("이름 :"+name);
		System.out.println("부서 :"+dept);
	}
	
}
