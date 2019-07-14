package arrayTest;

public class Test05 {
	static void m1(int[] ia) {
		ia[2]=20;
	}
	public static void main(String[] args) {
		int[] a= {30,40,50,60,70,80};
		m1(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"\t");
		}
	}

}
