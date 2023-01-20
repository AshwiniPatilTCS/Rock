package practiceprogram;

public class Con1 {
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
}
	public Con1() {
		System.out.println("m3");
		}
	public Con1(boolean c) {
		this();
		System.out.println("m4");
		}
	public Con1(int a) {
		this(true);
	
		System.out.println("m5");
	}

}