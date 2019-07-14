class localpreferance{
    static int a=10;
    static int b=20;
    public static void main(String...args){
        System.out.println(a+"..."+b);
        int a=20;
        System.out.println(a+"..."+b);
        System.out.println(localpreferance.a+"..."+a);
    }
}