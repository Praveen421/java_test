class Example02{
	int p=10;
	static void m1(){
		
		System.out.println(p);
		m2();
	}
	static void m2(){
		int q=p+10;
		System.out.println(q);
	}
	public static void main(String...args){
		m1();
	}
}