import java.io.*;
import java.util.*;
class FileCopy1{
	public static void main(String[] args)
		throws FileNotFoundException,IOException{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the source file : ");
		FileInputStream fis=new FileInputStream(scn.nextLine());
		System.out.println("enter the destination file");
		FileOutputStream fos=new FileOutputStream(scn.nextLine());
		int data;
		while((data=fis.read())!=-1){
			fos.write((char)data);
	    }
		System.out.println("data copied");
   }
}
