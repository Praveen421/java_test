package wrapperclassTest;

public class WCOPDTTest02 {

	public static void main(String[] args) {
		Integer io1=new Integer(100);
		int a=io1.intValue();
		System.out.println(a);
		byte b=io1.byteValue();
		System.out.println(b);
		String c=io1.toString();
		System.out.println(c);
		
		//PSO=>WCO
		
		//Integer io2=new Integer("fghj");
		//System.out.println(io2);
        Integer io2=new Integer('a');
        System.out.println(io2);
        Integer io3=new Integer(10);
        Integer io4=new Integer(20);
        Integer io5=io3+io4;
        System.out.println(io5);
        
	}

}
