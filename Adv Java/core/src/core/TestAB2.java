package core;
class Example{
	m1(Example e){
		System.out.println("Example param");
	}
}
class Sample extends Example{
	m1(Sample s){
		System.out.println("Sample param");
	}
}
public class TestAB2 {
	public static void main(String[] args) {
		Example e =  new Example();
		m1(new Example());
		
	}
}