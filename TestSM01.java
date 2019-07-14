//static members
class A{
    static int a=10;
    static int b=20;
}
class TestSM01 extends A{
    public static void main(String[]args){
    System.out.println("a :"+a);
    System.out.println("b :"+b);
    }
}