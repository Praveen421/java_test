package core;
public class MOL3 {
   static void m1(int a) {
	 System.out.println("int arg");  
   }
   static void m1(float f) {
	   System.out.println("float arg");
   }
   public static void main(String[] args) {
	   m1(10);
	   m1('a');
	   m1(50l);
	   long l = 50;
	   m1(l);
	   //m1(50.34);  //try this statement also to know CE
   }
}