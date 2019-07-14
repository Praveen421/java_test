package test;
import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the no : ");
		while(scn.hasNextLine()) {
			ArrayList<Integer> al=new ArrayList<>();
			Scanner line=new Scanner(scn.nextLine());
			while(line.hasNextLine()) {
				al.add(Integer.parseInt(line.next())); 
			}
			line.close();
			System.out.println(al);
			System.out.println(al.size());
		} 
		scn.close();
	}
}
