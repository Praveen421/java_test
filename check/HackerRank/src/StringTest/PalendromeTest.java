import java.util.*;
class PalendromeTest{
	public static void main(String[] args){
		System.out.println("Hello World!");
	
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string : ");
		String s=scn.nextLine();
		String[] a=s.split("");
		System.out.println(Arrays.toString(a));

		for(int i=s.length()-1,j=0;j<=i/2;j++){
			if(a[j]==a[i-j-1])
				continue;
			else{
			System.out.println("not palendrome ");
				continue last;
		    }
		    		
	   }
	   System.out.println("palendrome");
	   last: 	
	}
	   
}
