package test;

public class MyThread4 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(getName()+"run : "+i);
		}
	}
	public static void main(String[] args) {
		MyThread4 mt=new MyThread4(); 
		mt.start();
		MyThread4 m1=new MyThread4();
		m1.start();
		for(int i=0;i<10;i++) {
			System.out.println(mt.getName()+"main : "+i);
		}
		for(int i=0;i<10;i++) {
			System.out.println(m1.getName()+"main : "+i);
		}
		
	}
}
