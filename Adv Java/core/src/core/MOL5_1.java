package core;
/*class A15{
	void m1(int a) {
		System.out.println("A int arg");
	}
};
class B15 extends A15{
	void m1(float f) {
		System.out.println("B float arg");
	}
	void m1(char ch) {
		System.out.println("B char arg");
	}
}

public class MOL5_1 {
	public static void main(String[] args) {
		B15 b = new B15();
		b.m1(50);
		b.m1('a');
		b.m1(50L);
		System.out.println();
		A15 a=new B15();
		a.m1(50);
		a.m1('a');
		//a.m1(50L);
	}

}
*/
/*class A15{
	void m1(int a) {
		System.out.println("A int arg");
	}
	void m1(char ch) {
		System.out.println("B char arg");
	}
};
class B15 extends A15{
	void m1(float f) {
		System.out.println("B float arg");
	}
	void m1(char ch) {
		System.out.println("B char arg");
	}
}

public class MOL5_1 {
	public static void main(String[] args) {
		B15 b = new B15();
		b.m1(50);
		b.m1('a');
		b.m1(50L);
		System.out.println();
		A15 a=new B15();
		a.m1(50);
		a.m1('a');
		//a.m1(50L);
	}

}
*/
/*
class A15{
	void m1(float f) {
		System.out.println("A float arg");
	}	
};
class B15 extends A15{
	void m1(int a) {
		System.out.println("B int arg");
	}
	void m1(long l) {
		System.out.println("B long arg");
	}
	void m1(float f) {
		System.out.println("B float arg");
	}
}

public class MOL5_1 {
	public static void main(String[] args) {
		B15 b = new B15();
		b.m1(50);
		b.m1('a');
		b.m1(50L);
		System.out.println();
		A15 a=new B15();
		a.m1(50);
		a.m1('a');
		a.m1(50L);
	}
}
*/
/*
class A15{
	void m1(Object obj) {
		System.out.println("A Object arg");
	}	
};
class B15 extends A15{
	void m1(String s) {
		System.out.println("B String arg");
	}
}

public class MOL5_1 {
	public static void main(String[] args) {
		B15 b = new B15();
		
		b.m1("a");
		b.m1(10);
		System.out.println();
		A15 a=new B15();
		
		a.m1("a");
		a.m1(10);
	}
*/
/*
class A15{
	void m1(String s) {
		System.out.println("A String arg");
	}	
};
class B15 extends A15{
	void m1(Object obj) {
		System.out.println("B object arg");
	}
}

public class MOL5_1 {
	public static void main(String[] args) {
		B15 b = new B15();
		
		b.m1("a");
		b.m1(10);
		System.out.println();
		A15 a=new B15();
		
		a.m1("a");
		//a.m1(10);
	}
}
*/
/*
class A15{
	void m1(String s) {
		System.out.println("A String arg");
	}
	void m1(Integer io) {
		System.out.println("A Integer arg");
	}
};
class B15 extends A15{
	void m1(Object obj) {
		System.out.println("B object arg");
	}
	void m1(String s) {
		System.out.println("B String arg");
	}
	void m1(Integer io) {
		System.out.println("B Integer arg");
	}
}

public class MOL5_1 {
	public static void main(String[] args) {
		B15 b = new B15();
		
		b.m1("a");
		b.m1(10);
		System.out.println();
		A15 a=new B15();
		
		a.m1("a");
		a.m1(10);
	}
}
*/
class A15{
	void m1(Object obj) {
		System.out.println("A object arg");
	}
};
class B15 extends A15{
	void m1(Object obj) {
		System.out.println("B object arg");
	}
	void m1(String s) {
		System.out.println("B String arg");
	}
}

public class MOL5_1 {
	public static void main(String[] args) {
		B15 b = new B15();
		
		b.m1("a");
		b.m1(10);
		System.out.println();
		A15 a=new B15();
		
		a.m1("a");
		a.m1(10);
	}
}