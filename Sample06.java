class Example06{
    void m1(){
        System.out.println("Example m1");
    }
    static void m2(){
        System.out.println("Example m2");
    }
    void m3(){
        System.out.println("Example m3");
    }
}
class Sample06 extends Example06{
    void m1(){
        System.out.println("Sample m1");
    }
    static void m2(){
        //super.m2(); we cannot use super keyword  in static method
        Example06.m2();
        System.out.println("Sample m2");
    }
    public static void main(String[] args){
        Sample06 s = new Sample06();
        s.m1();
        s.m2();
        s.m3();
    }
}