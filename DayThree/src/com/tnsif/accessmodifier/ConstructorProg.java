package com.tnsif.accessmodifier;
class Prog{
	public Prog()
	{
		System.out.println("hello all");
	}
	public Prog(int a,int b) {
		System.out.println((a+b));
	}
	public Prog(double a,double b,double c) {
		System.out.println((a+b+c));
	}
}
public class ConstructorProg {

	public static void main(String[] args) {
	Prog p1=new Prog();
	Prog p2=new Prog(3,4);
	Prog p3=new Prog(2.5,1.5,2.3);
	

	}

}
