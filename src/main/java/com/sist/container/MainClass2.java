package com.sist.container;

class A{
	public A(){
		System.out.println("��ü ����!");
	}

	//�Ҹ���
	protected void finalize() throws Throwable {
		System.out.println("��ü �Ҹ�!"); //��ü�� �Ҹ��Ϸ��� gc�� ȣ���ؾ�
	}
	
}

public class MainClass2 {

	public static void main(String[] args) {
		A a=new A();
		//Ȱ��
		//�Ҹ�
		a=null;
		System.gc();

	}

}
