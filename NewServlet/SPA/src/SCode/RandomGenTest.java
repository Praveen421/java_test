package SCode;
import java.util.*;
public class RandomGenTest {
	public static void main(String[] args) {
		Random r=new Random();
		int n;
		for(int count=1;count<=10;count++) {
			n=1+r.nextInt(6);
			System.out.println(n+" ");
		}
	}
}
