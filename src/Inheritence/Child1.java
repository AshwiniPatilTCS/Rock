package Inheritence;

public class Child1 extends Parent1{
	public void m2() {
		System.out.println("m2 child method");
	}
	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.m2();
		obj.m1();
		System.out.println(obj.b);
		System.out.println(a);
		
		
		
	}

}
