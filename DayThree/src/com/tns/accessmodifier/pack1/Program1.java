package com.tns.accessmodifier.pack1;

     public class Program1
    {
    	 public int a=10,b=20,c;
	     public void display1() 
	    {
		System.out.println(c=(a+b));
		System.out.println("good morning");
	    }
    
    
    public static void main(String[] args) 
    {
	Program1 p=new Program1();
	p.display1();
	}

}
