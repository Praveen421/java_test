class ExampleCCT{
	void m1() {
		System.out.println("Example m1 ");
	}
}
class SampleCCT extends ExampleCCT{
	void m2() {
		System.out.println("Sample m2");
	}
}
public class TestCCT {
    static void m3(Object obj) {
    	if(obj instanceof ExampleCCT) {
    		ExampleCCT e=(ExampleCCT)obj;
    		e.m1();
    	}else if (obj instanceof SampleCCT) {
    		SampleCCT s=(SampleCCT)obj;
    		s.m1();
    		s.m2();
    	}
    }
	public static void main(String[] args) {
		TestCCT.m3(new ExampleCCT());
		//TestCCT.m3(new SampleCCT());
		//TestCCT.m3(new Object());	
	}
}