class A8{
    static int a=10;
    int x=20;
}
class B8 extends A8{
    static int a=30;
    int x=40;
}
class TestAB8_1{
    public static void main(String[] args){
        B8 b1=new B8();
        A8 a1=new B8();
        System.out.println(b1.a+"..."+b1.x);
        System.out.println(a1.a+"..."+a1.x);
        System.out.println(B8.a+"..."+A8.a);
    } 
    
}