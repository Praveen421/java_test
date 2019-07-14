class Example04{
    static int a=m1();
    static{
        System.out.println("Example SB");
    }
    int x=m2();
    {
        System.out.println("Example NSB");
    }
    Example04(){
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
    void abc(){
        System.out.println("Example abc");
    }
    void bbc(){
        System.out.println("Example bbc");
    }
}
class Sample04 extends Example04{
    static int b = m3();
    static{
        System.out.println("Sample SB");
    }
    int y = m4();
    {
        System.out.println("Sample NSB");
    }
    Sample04(){
        System.out.println("Sample constructor");
    }
    static int m3(){
        System.out.println("Sample SV is created");
        return 30;
    }
    int m4(){
        System.out.println("Sample NSV is created");
        return 40;
    }
    void abc(){
        System.out.println("Sample abc");
    }
    public static void main(String[] args){
        System.out.println("Sample main");
        Sample04 s = new Sample04();
        s.abc();
        s.bbc();
    }
}