import java.io.*;
class FOSDemo{

	public static void main(String[] args)
		throws FileNotFoundException,IOException{
		FileOutputStream fos=new FileOutputStream("output.txt");
		for(int i=67;i<86;i++){
		fos.write(i);
		}
		System.out.println("data is uploaded");
		fos.close();
	}
}
