package com.tnsif.abstarct;

abstract class Animal
{
  abstract void eat();
  
}
 class AbstractDemo extends Animal
{
	void eat()
	{
System.out.print("Hello all");
	}
}
class Carnivores extends Animal {
	void eat()
	{
System.out.print("i am vegiterian");
	}
	public static void main(String args[])
	{
		Animal goat = new AbstractDemo();
		goat.eat();
		
	}
	}

