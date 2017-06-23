package com.sist.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.sawon.Sawon;
import com.sist.sawon.Sawon2;

//main, jsp
//main이 들어가는 부분이 클라이언트 측
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml"); //src/main/java(context)의 app.xml을 읽어온다(파싱)
		/*Sawon sa=(Sawon)app.getBean("sa"); //DL , app가 갖고있는 클래스 객체를 얻어온다
		System.out.println("sa:"+sa);
		Sawon sa1=(Sawon)app.getBean("sa"); //DL , app가 갖고있는 클래스 객체를 얻어온다
		sa1.setSabun(2);
		sa1.setName("심청이");
		sa1.setDept("영업부");
		System.out.println("sa1:"+sa1);
		//sa.init();
		sa.print();
		//sa1.init();
		sa1.print();*/
		Sawon2 sa=(Sawon2)app.getBean("sa2");
		sa.print();
	}

}
