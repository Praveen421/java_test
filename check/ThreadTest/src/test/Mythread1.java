package test;

public class Mythread1 implements Runnable{
	@Override
    public void run() {
		System.out.println("run : executed");
	}
	public static void main(String[] args) {
		Mythread1 mt=new Mythread1();
	    Thread th=new Thread(mt);
	    th.start();
	    System.out.println("main thread");
	}
}
