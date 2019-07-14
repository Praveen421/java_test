import java.io.*;
class FileCopyDemo{

	public static void main(String[] args)
		throws FileNotFoundException,IOException{
		FileInputStream fis=new FileInputStream("output.txt");
		FileOutputStream fos=new FileOutputStream("test.txt");
		int data;
		while((data=fis.read())!=-1){
			fos.write(data);
		}
		fis.close();
		fos.close();
    }
}
