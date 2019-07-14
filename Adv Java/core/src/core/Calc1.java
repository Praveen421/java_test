package core;
interface Shape1{
	void area();
	void perimeter();
}
class Rectangle implements Shape1{
	private double l;
	private double b;
	public Rectangle(double l,double b) {
		this.l=l;
		this.b=b;
	}
	public void area() {
		System.out.println("rectangle area is : "+(l*b));
	}
	public void perimeter() {
		System.out.println("rectangle perimeter is : "+(2*(l+b)));
	}
	public void printLB() {
		System.out.println("l : "+l);
		System.out.println("b : "+b);
	}
}
class Square implements Shape1{
	private double s;
	public Square(double s) {
		this.s=s;
	}
	public void area() {
		System.out.println("Square area is : "+(s*s));
	}
	public void perimeter() {
		System.out.println("Square perimeter is : "+(4*s));
	}
	public void printS() {
		System.out.println("s : "+s);
	}
}
class Circle implements Shape1{
	public static final float pi=3.14f;
	private double r;
	public Circle(double r) {
		this.r=r;
	}
	public void area() {
		System.out.println("Circle area is : "+(pi*r*r));
	}
	public void perimeter() {
		System.out.println("Circle perimeter is : "+(2*pi*r));
	}
	public void printR() {
		System.out.println("Radius : "+r);
	}
}
class Run2{
	public static void medium(Shape1 a) {
		a.area();
		a.perimeter();
		if(a instanceof Rectangle) {
			((Rectangle)a).printLB();
		}
		if(a instanceof Square) {
			((Square)a).printS();
		}
		if(a instanceof Circle) {
			((Circle)a).printR();
		}
	}
}

public class Calc1 {
	public static void main(String[] args) {
		Run2.medium(new Rectangle(5,6));		
		Run2.medium(new Square(5));
		Run2.medium(new Circle(30));
	}
}