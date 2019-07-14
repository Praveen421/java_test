class Testfb1{
    public static void main(String...args){
        int[]x={5,6,7,8,9};
        int[]y=x;
        y[2]=10;
        System.out.println(x[2]+"");
        System.out.println(y[2]+"");
        System.out.println(x[0]+"");
        System.out.println(x[1]+"");
        System.out.println(x[3]+"");
        System.out.println(x[4]+"");
    }
}