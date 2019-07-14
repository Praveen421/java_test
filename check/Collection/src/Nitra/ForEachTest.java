package Nitra;
public class ForEachTest {
	public static void main(String[] args) {
		int [][] a= {{10,20,30,40},{60,50}};
		System.out.println(a);
		for(int [] x:a) {
			for(int y:x) {
				System.out.println(y);
			}
		}
	}
}
