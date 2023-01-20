package String_class;

public class String_methods {
public static void main(String[] args) {
	String s1="velocity;";
	String s2="VELOCITY";
	String S3="CITY";
	System.out.println(s1.length());
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toLowerCase());
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(S3));
	System.out.println(s1.contains(S3));
	System.out.println(s2.contains(S3));
	System.out.println(s1.charAt(7));
	System.out.println(s2.charAt(5));
	System.out.println(s1.indexOf('y'));
	System.out.println(s1.concat(S3));
	System.out.println(s1.substring(4));
	System.out.println(s1.startsWith("ve"));
	System.out.println(s1.endsWith("ty"));
	
}
}
