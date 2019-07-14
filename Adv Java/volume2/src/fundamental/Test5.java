package fundamental;
class Example3 implements Cloneable {
	int x=10;
	int y=20;
	 public Example3 clone() throws CloneNotSupportedException{
		return(Example3)super.clone();
	}
}
public class Test5 {
	public static void main(String[] args)
	throws CloneNotSupportedException{
				Example3 e1=new Example3();
				Example3 e2=e1.clone();
				System.out.println(e1+"..."+e2);
				
	}
}