class Shape{
    static void findArea(){
    System.out.println("shape area calculated");
    }
}
class Rectangle extends Shape{
    static void findArea(){
        System.out.println("Rectangle are cal. ");
    }
}
class Circle extends Shape{
    static void findArea(){
        System.out.println("circle are cal. ");
    }
}
class Areacal{
    public static void main(String [] args){
        Shape s = new Rectangle();
        s.findArea();
    }
}