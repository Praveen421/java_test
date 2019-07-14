package wrapperclassTest;

public class PDTWCOTest01 {

	public static void main(String[] args) {
		int i=50;
		@SuppressWarnings("deprecation")
		Integer io1=new Integer(i);
		Integer io2=Integer.valueOf(i);
		System.out.println("i : "+i);
		System.out.println("io1 : "+io1);
		System.out.println("io2 : "+io2);
		
		//Byte b1=new Byte(50);
		Byte b1=new Byte((byte)50);
		Character ch1=new Character('a'); 
		System.out.println("b1:"+b1);
		System.out.println("ch1:"+ch1);
		Boolean b0=new Boolean(true);
		System.out.println(b0);
        
		Float f1=new Float(70);
		Float f2=new Float(70.56);
		Float f3=new Float(70.54f);
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		
		Double d1=new Double(67.54);
		Double d2=new Double(67);
		//Double d3=new Double("a");
		Double d3=new Double('a');
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}

}
