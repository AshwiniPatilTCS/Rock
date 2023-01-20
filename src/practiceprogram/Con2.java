
package practiceprogram;

public class Con2 extends Con1 {
	public void t1() {
		System.out.println("t1");
		}
	public Con2() {
		this(55);
		System.out.println("t2");
		}
	public Con2(int a) {
		 super(55);
		System.out.println("t3");
		}
	
	public void n1() {
		System.out.println("n1");}
}
