package core;
class ExampleSK{
	ExampleSK(){
		System.out.println("no param Super class");
	}
	ExampleSK(int i){
		System.out.println("int param Super class");
	}
}
public class TestSK extends ExampleSK {
	TestSK(){
		System.out.println("no param subclass");
	}
	TestSK(int j){
		//super(50);
		System.out.println("int param sub class");
	}
	public static void main(String[] args) {
		//new TestSK();
		new TestSK(40);
	}
}
