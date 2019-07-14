import java.io.*;
class FISDemo1{

	public static void main(String[] args)
		throws FileNotFoundException,IOException{
		int data;
		FileInputStream fis=new FileInputStream("hello.txt");
		while((data=fis.read())!=-1){
			System.out.println("data  : "+(char)data);
		}
		fis.close();
	}
}
