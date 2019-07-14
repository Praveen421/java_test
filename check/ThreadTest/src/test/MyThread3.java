package test;

public class MyThread3 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("run: "+getName()+i);
		}
	}
	public static void main(String[] args) {
		//Thread th=new Thread();
		MyThread3 mt=new MyThread3();		
		
		
		mt.start();  
		mt.start(); 
		for(int i=1;i<10;i++) {
			System.out.println("main: "+mt.getName()+i);
		}		
	}
}
