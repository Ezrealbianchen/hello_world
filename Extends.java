package com.Ezreal;

class Bird{
	
	public Bird fly(){
		return new Bird();
	}
	
	void show(){
		System.out.println("����show");
	}
}

class Eagle extends Bird{
	
	public Eagle fly(){
		return new Eagle();
	}
	
	void show(){
		System.out.println("����show");
	}
}

public class Extends {
	public static void main(String[] args){
		
	Bird b = new Bird();
	b.fly().show();
	//b = new Eagle();
	//b.show();
	b.fly().show();
	System.out.println(b.fly().getClass());
	//instanceof ǰ��Ĳ�����һ���������ͣ������б���������Ƿ�Ϊ����һ��������һ���ࣩ��ʵ������������
	//System.out.println(b instanceof Eagle);
	//b��Bird���ʵ��
	/*
	if(b instanceof Eagle ) {
		b = (Eagle)b;
	}
	*/
	Bird e = new Eagle();
	System.out.println(e.getClass());
	
	//System.out.println(e instanceof Eagle);
	System.out.println((new Bird()) instanceof Eagle);
	if(e instanceof Eagle) {
		Eagle c = (Eagle)e;
	}
	System.out.println(e.getClass());
	/*
	System.out.println(e instanceof Bird);
	if(e instanceof Bird) {
		Bird e1 = (Bird)e;
		e1.show();
		System.out.println(e1.getClass());
		
	}	*/
	}
}