package com.sist.sawon;
/*
 * 	��������� �ʱⰪ �ο�
 * 	=> setter
 * 	=> ������
 * 	=> static ��, �ν��Ͻ� ��
 * 	class A
 * 	{
 * 		int a=10;  0=>10=>20=>30
 * 		{
 * 			a=20;	//file �б�
 * 		}
 * 		public A()
 * 		{
 * 			a=30;
 * 		}
 * 	}
 * 
 * 	A a=new A();
 * 	A.this=a; //JVM ���� this��ü ����
 * 
 * 	�ڹ� �޸� ����
 * 	====================
 * 	Method ����
 * 	static 
 * 		=data �ʱ�ȭ �� static int a;
 * 		=data �ʱ�ȭ	  static ina a=10;
 * 	====================
 * 	Stack ����	=> �޸� ����
 * 	====================
 * 	Heap ����	=> ���α׷���	==>gc
 * 		near heap
 * 		far heap
 * 	====================
 * 
 * 	 class A
 * 		int a;
 * 
 * 	A aa=new A();
 * 		aa : Stack�� ����		a 	heap 
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
		System.out.println("��� :"+sabun);
		System.out.println("�̸� :"+name);
		System.out.println("�μ� :"+dept);
	}
	
}
