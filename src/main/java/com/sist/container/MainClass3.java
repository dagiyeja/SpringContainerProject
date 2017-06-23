package com.sist.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.temp.MemberConfig;
/*
 * class B<T>
 * {
 * 	private T t;
 * 	public void setT(T t){
 *		 
 *	 	}
 *		public T getT(){
 *			return t;
 *		}
 * }
 * 
 * B<String> b=new B<String>();
 * 	
 * */

public class MainClass3 {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("app2.xml");
		// 제네릭 : 데이터형을 통일화
		MemberConfig mc=app.getBean("mc",MemberConfig.class); //object 형인 클래스를 형변환
		mc.print();
	}

}
