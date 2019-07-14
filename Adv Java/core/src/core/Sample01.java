package core;
class Example01{
    static int a = m1();
    
    static{
    	System.out.println("Example SB");
    }
    
    int x =m2();
    
    {
        System.out.println("Example NSB");
    }
    
    Example01(){
    	System.out.println("Example constructor");
    }
    
    static int m1(){
        System.out.println("Example SV is created");
        return 10;
    }
    
    int m2(){
        System.out.println("Example NSV is created");
        return 20;
    }
    
    void abc() {
    	System.out.println("Example abc");
    }
    
    void bbc() {
    	System.out.println("Example bbc");
    }    
}
public class Sample01 extends Example01 {
    
    static int b = m3();
    
    static {
    	System.out.println("Sample SB");
    }
    
    int y=m4();
    
    {
        System.out.println("Sample NSB");
    }
    
    Sample01(){
        System.out.println("Sample Constructor");
    }
    
    static int m3(){
        System.out.println("Sample SV is created");
        return 30;
    }    
    int m4(){
        System.out.println("Sample NSV is created");
        return 40;
    }
    void abc() {
    	System.out.println("Sample abc");
    }
    public static void main(String[] args){
    	System.out.println("Sample main");
        Sample01 s = new Sample01();
        s.abc();
        s.bbc();
    }
}