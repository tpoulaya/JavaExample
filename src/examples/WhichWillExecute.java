package examples;

public class WhichWillExecute extends StaticMethodExample{

	public static void main(String[] args) {
		WhichWillExecute mm = new WhichWillExecute();
		mm.display(null);
		mm.result();
	}
	
	public void display(Object obnj){
		System.out.println("Object");
	}
	
	public void display(String str){
		System.out.println("String");
	}
	
	public void result(){
		System.out.println(1+2+" = "+3+4+(-15));
	}
	
	public void accessStaticVariable(){
		i = i-10;
		System.out.println("B"+i);
	}

}
