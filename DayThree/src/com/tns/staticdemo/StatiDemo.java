package com.tns.staticdemo;

public class StatiDemo {
static {
	System.out.println("i am in static block");
}
static void display()
{
	System.out.println("i am inside static method");
}
	public static void main(String[] args) {
		System.out.println("i am inside main");
		display();
	}

}
