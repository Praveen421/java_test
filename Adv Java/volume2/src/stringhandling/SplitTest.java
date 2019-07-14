package stringhandling;

import java.util.Arrays;

public class SplitTest {

	public static void main(String[] args) {
		String s1="Hello Praveen Kumar";
		System.out.println(s1);
		//System.out.println(s1.split("P"));
		//System.out.println(s1.split("r"));
		//System.out.println(s1.split("a"));
        String[] s2=s1.split("");
        System.out.println(s2[0]+" "+s2[1]+" "+s2[2]+" "+s2[3]+" "+s2[4]+" "+s2[5]+" "+s2[6]+" "+s2[7]+" "
        		+s2[8]+" "+s2[9]+" "+s2[10]+" "+s2[11]+" "+s2[12]+" "+s2[13]+" "+s2[14]+" "+s2[15]+" "+s2[16]+" "
        		+s2[17]+" "+s2[18]+" ");
        System.out.println(s1.split("P"));
        String[] s3=s1.split(" ");
        System.out.println(s3.length);
        System.out.println(Arrays.toString(s3));
        System.out.println(Arrays.toString(s2));
        String[] s4=s1.split("e");
        System.out.println(s4.length);
        System.out.println(Arrays.toString(s4));
        
        String s5="abc.txt";
        String[] s6=s5.split("");
        System.out.println(Arrays.toString(s6));
	}

}
