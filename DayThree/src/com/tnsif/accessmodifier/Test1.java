package com.tnsif.accessmodifier;

class Demo{
	private int idno;
	private String name;
	public int getIdno() {
		return idno;
	}
	public void setIdno(int idno) {
		this.idno = idno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo [idno=" + idno + ", name=" + name + "]";
	}
	
	
}
public class Test1 {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.setIdno(111);
		d.setName("ravi");
		System.out.println(d);
				
		
	}

}
