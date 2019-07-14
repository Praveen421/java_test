class Example05{
    Example05(){
        System.out.println("Example zero-parameter");
    }
    Example05(int a){
        System.out.println("Example int-parameter");
    }
}
class Sample05 extends Example05{
    Sample05(){
        System.out.println("Sample zero-param");
    }
    Sample05(int a){
        super(50);
        System.out.println("Sample int-param");
    }
    public static void main(String[] args){
        //Sample05 s = new Sample05();
        Sample05 s = new Sample05(10);
    }
}