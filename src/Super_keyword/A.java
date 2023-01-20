package Super_keyword;

public class A extends Super_key{
	int c=75;
	int d=42;
	public void m2() {
		System.out.println(c);
		System.out.println(super.a);
		System.out.println(Super_key.b);
	}
	public static void main(String[] args) {
		A ref=new A();
		ref.m2();
	}

}
