package test;
import java.util.*;
public class Test02 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the  nos :" );
		while(true) {
			al.add(Integer.parseInt(scn.nextLine()));			
			if(scn.nextLine().isEmpty()) {
				break;
			}else {
				continue;
			}
		}
		System.out.println(al);
	}
}
