package test;
public class Sample {
	private int x;
	public Sample() {}
	public Sample(int x) {
		this.x=x;		
	}
	public Sample setx(int x) {
		Sample s=new Sample();
		s.x=x;
		return s;
	}
	public int getx() {
		return x;
	} 
}
