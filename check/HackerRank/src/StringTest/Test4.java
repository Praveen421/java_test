package StringTest;
public class Test4 {
	private int a[];
	public Test4() {
		for(int i=0;i<10;i++) {
			a[i]=i;
		}
	}
	public static void main(String[] args) {
		System.out.println("check");
		Test4 t=new Test4();
		System.out.println(t.a);
	}
}
