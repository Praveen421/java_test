package Nitra;
public class NITAddTest {

	public static void main(String[] args) {		
		NITCollection col=new NITCollection();
		for(int i=0;i<11;i++) {
			col.add(i);
		}
		System.out.println(col);
	}
}