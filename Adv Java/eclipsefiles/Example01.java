class Example01{
	static int a=10;
	static int b=20;
	
	int x=30;
	int y=40;
	public static void main(String[] args){
		int p=50;
		int q= 60;

		System.out.println("a :"+a);
		System.out.println("b :"+b);
		//System.out.println("x :"+x);
        //System.out.println("y :"+y);
	    Example01 e=new Example01();
		System.out.println("e.x :"+e.x);
		System.out.println("e.y :"+e.y);
		System.out.println("p :"+p);
		System.out.println("q :"+q);
		Sample01 s=new Sample01();
		System.out.println("s :"+s);
	}
}