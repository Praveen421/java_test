package test02;
public class intern_Test {
	public static void main(String[] args) {
		String s1="   Hari    ";
		String s2=s1.intern();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println();
		
		String s3=new String("    Hari   ");
		String s4=s3.intern();
		String s5="Hari";
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
		System.out.println(s3==s5);
		System.out.println();
		
		String s6=s1.trim();
		String s7=s6.intern();
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s6==s7);
		
		String s8=s3.trim();
		System.out.println(s8==s3);
		System.out.println();
		
		String s9="NIT";
		String s10=s6.concat(s9);
		System.out.println(s10);
		String s11=s9.intern();
		System.out.println(s10==s11);  
		
		String s12=new String("a");
		String s13=new String("a");
		String s16=s12;
		String s17=s13;
		String s14=s12.intern();
		String s15=s13.intern();
		System.out.println(s16==s17); 
		System.out.println(s14==s15);
	}
}
