package com.sist.sawon;
//Spring = Container (class)
/*
 * �����̳� (Ŭ���� ����)
	 * ==> ����
	 		BeanFactory			: core,( DI, DL) (���� ���� ����)
	 				|
	  	ApplicationContext		:  core,( DI, DL), AOP, ����ȭ
	  				|
	  WebApplicationContext	: core,( DI, DL), AOP, ����ȭ, web(MVC)
	  
	  ==> ����
	  			1) XML �б�
	  			2) XML �Ľ�
	  			3) Ŭ���� �޸� �Ҵ�
	  				SAX => id, class => Map
	  				3_1)	������ DI
	  			4) setter DI(���� ������� ����ϸ� ����)
	  			4) �޼ҵ� ȣ�� : init-method
	  			================================
	  				���α׷��Ӱ� ���ϴ� �޼ҵ� Ȱ��(DL)- Ŭ���� ��ü ������ :����� �Ҹ��� �������� �ʰ�, �츮�� �ؾ� �� �κ�
	  			================================
	  			6) �޼ҵ� ȣ�� : destroy-method
	  			
	  			=> Container : ��ü�� �����ֱ⸦  �����ϴ� ����
	  									========
	  									XML�� ���ؼ� ���� (����~�Ҹ�)
	  			
	  			
	  			
  */
public class Sawon {
	private int sabun;
	private String name;
	private String dept;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void init(){
		System.out.println("=====�������=====");
	}
	public void destroy(){
		System.out.println("=====�޸� ����====");
	}
	public void print(){
		System.out.println("��� :"+sabun);
		System.out.println("�̸� :"+name);
		System.out.println("�μ� :"+dept);
	}
	
	
}
