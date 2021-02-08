package examples;

public class InnerClassTests extends InnerClassExample{

	public static void main(String[] args) {
		InnerClassExample.inner in = new InnerClassExample().new inner();
		in.show();
		System.out.println(in.rOuterClassInstanceVar());
	}

}
