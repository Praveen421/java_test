package fundamental;
class Example{
	int x=10;
	int y=20;
	@Override
	public int hashCode() {
		return x+y;
	}
	
	public int JVMHC() {
		return super.hashCode();
	}
}
public class HashCodeDemo {

	public static void main(String[] args) {
		Example e1=new Example();
		Example e2=new Example();
		
		System.out.println("hash code of e1 is : "+e1.hashCode());
		System.out.println("hash code of e2 is : "+e2.hashCode());
		System.out.println("hash code of e2 is : "+e1.JVMHC());
		System.out.println("hash code of e2 is : "+e2.JVMHC());
		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
	}
}