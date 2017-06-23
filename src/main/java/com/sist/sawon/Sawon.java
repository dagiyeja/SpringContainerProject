package com.sist.sawon;
//Spring = Container (class)
/*
 * 컨테이너 (클래스 관리)
	 * ==> 종류
	 		BeanFactory			: core,( DI, DL) (가장 작은 개념)
	 				|
	  	ApplicationContext		:  core,( DI, DL), AOP, 국제화
	  				|
	  WebApplicationContext	: core,( DI, DL), AOP, 국제화, web(MVC)
	  
	  ==> 동작
	  			1) XML 읽기
	  			2) XML 파싱
	  			3) 클래스 메모리 할당
	  				SAX => id, class => Map
	  				3_1)	생성자 DI
	  			4) setter DI(값을 넣으라고 명령하면 지정)
	  			4) 메소드 호출 : init-method
	  			================================
	  				프로그래머가 원하는 메소드 활용(DL)- 클래스 객체 가져옴 :생명과 소멸은 관여하지 않고, 우리가 해야 할 부분
	  			================================
	  			6) 메소드 호출 : destroy-method
	  			
	  			=> Container : 객체의 생명주기를  관리하는 역할
	  									========
	  									XML을 통해서 제작 (생성~소멸)
	  			
	  			
	  			
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
		System.out.println("=====사원정보=====");
	}
	public void destroy(){
		System.out.println("=====메모리 해제====");
	}
	public void print(){
		System.out.println("사번 :"+sabun);
		System.out.println("이름 :"+name);
		System.out.println("부서 :"+dept);
	}
	
	
}
