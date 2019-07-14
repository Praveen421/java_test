package fundamental;
class A1{
	int x;
	A1(int x){
		this.x=x;
	}
	@Override //toString()
	public String toString() {
		return ""+x;
	}
	public String TOSTRING() {
		return super.toString();
	}
	@Override //hashCode()
	public int hashCode() {
		return x;
	}
	
	public int JVMHC() {
		return super.hashCode();
	}
}
public class Test4 {

	public static void main(String[] args) {
		A1 a=new A1(5);
		A1 a1=new A1(6);
		System.out.println("toString method : "+a);
		System.out.println("Original toString method : "+a.TOSTRING());
		System.out.println("a hash code is : "+a.hashCode());
		System.out.println("a original hash code is : "+a.JVMHC());
	}
}