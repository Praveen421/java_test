package test;
public class MyThread5 extends Thread{
	private int x;
	MyThread5(int x){
		this.x=x;
	}
	public void run() {
		for(int i=1;i<x;i++) {
			System.out.println("run");
		}
	}
	public static void main(String[] args) {
		MyThread5 m1=new MyThread5(20);
		m1.start();
	}
}