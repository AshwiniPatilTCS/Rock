package Inheritence;

public class Child2 extends Parent2{
	static int a=100;
	int b=40;
	
	public void chmethod() {
		System.out.println(b);
		System.out.println(super.b);
		
	}
	public static void main(String[] args) {
		Child2 ch=new Child2();
		ch.chmethod();
		ch.prmethod();
	}
	

}
