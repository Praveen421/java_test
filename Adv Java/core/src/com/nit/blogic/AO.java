package com.nit.blogic;
public class AO{
	private int a,b;
	public AO( int a, int b) {
		 this.a=a;
		 this.b=b;
	}
	public int sub() {
		return a-b;
	}
	public int mul() {
		return a*b;
	}
	public  int div() {
		return a/b;
	}
	public int add() {
		return a+b;
	}
}