package test;
public class MyThread2 extends Thread{
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(getName()+"run: "+i);
		}
	}
	public static void main(String[] args) {
		MyThread2 mt=new MyThread2();
		mt.start();
		for(int i=0;i<10;i++) {
			System.out.println(mt.getName()+"main: "+i);
		}
	}
}
