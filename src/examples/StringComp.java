package examples;

public class StringComp {

	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		String c = new String("abc");
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(c));
	}
}
