import java.io.*;
class FISDemo{

	public static void main(String[] args)
		throws FileNotFoundException,IOException{
		FileInputStream fis=new FileInputStream("abc.txt");

		int data1=fis.read();
		int data2=fis.read();
		int data3=fis.read();
		System.out.print("data1 : "+data1);
		System.out.println("\tdata : "+(char)data1);
		System.out.print("data2 : "+data2);
		System.out.println("\tdata : "+(char)data2);
		System.out.print("data3 : "+data3);
		System.out.println("\tdata : "+(char)data3); 
		fis.close();
	}
}
