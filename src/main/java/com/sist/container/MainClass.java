package com.sist.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.sawon.Sawon;
import com.sist.sawon.Sawon2;

//main, jsp
//main�� ���� �κ��� Ŭ���̾�Ʈ ��
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml"); //src/main/java(context)�� app.xml�� �о�´�(�Ľ�)
		/*Sawon sa=(Sawon)app.getBean("sa"); //DL , app�� �����ִ� Ŭ���� ��ü�� ���´�
		System.out.println("sa:"+sa);
		Sawon sa1=(Sawon)app.getBean("sa"); //DL , app�� �����ִ� Ŭ���� ��ü�� ���´�
		sa1.setSabun(2);
		sa1.setName("��û��");
		sa1.setDept("������");
		System.out.println("sa1:"+sa1);
		//sa.init();
		sa.print();
		//sa1.init();
		sa1.print();*/
		Sawon2 sa=(Sawon2)app.getBean("sa2");
		sa.print();
	}

}
