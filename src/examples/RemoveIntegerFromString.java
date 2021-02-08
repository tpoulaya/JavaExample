package examples;

public class RemoveIntegerFromString {

	public static void main(String[] args) {
		RemoveIntegerFromString rm = new RemoveIntegerFromString();
		System.out.println(rm.remIntFrmStr("Pou12l3aya7"));
	}
	
	public String remIntFrmStr(String str) {
		return str.replaceAll("[0-9]", "");
	}
}
