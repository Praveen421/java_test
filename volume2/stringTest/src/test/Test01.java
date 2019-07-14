package test;
public class Test01 {
	public static void main(String[] args) {
		Sample s1=new Sample(5);
		System.out.println(s1.getx());
		Sample s2=s1.setx(8);
		System.out.println(s1.getx());
		System.out.println(s2.getx());
	}
}
