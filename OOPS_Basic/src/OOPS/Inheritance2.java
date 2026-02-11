package OOPS;


class Demo1{
	int age;
	int a;
	int b;
	Demo1(){
		
		System.out.println("Zero Constructor of demo1 parent class");
	}
	Demo1(int x,int y)
	{
		this.a=x;
		this.b=y;
		System.out.println("Parametrized constructor of parent class");
		System.out.println("a= "+a+"b="+b);
	}
	void display()
	 {
		 System.out.println("Display method of Demo1 parent class");
	 }
	
}

class Demo2 extends Demo1
{
	int age=20;
 Demo2()
 {

	 System.out.println("Zero Constructor of Demo2 Child class ");
 }
 void display()
 {
	 System.out.println("Display method of Demo2 child class");
 }
 
 Demo2(int x, int y)
 { 
	 //super(5,5);
	 this();
	 this.a=x;
	 this.b=y;
	 System.out.println("Parametrized constructor of child class");
	 System.out.println("a= "+a+"b="+b);
 }
}
 
 public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1=new Demo2(4, 6);
		d1.display();
		

	}

}
