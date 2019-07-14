package core;
import java.io.*;
public class FileIO {
	public static void main(String[] args)
	throws FileNotFoundException,IOException{
		FileInputStream fis=new FileInputStream("abc.txt");
		int data=fis.read();
		System.out.println("data : "+data);
		fis.close();
	}
}