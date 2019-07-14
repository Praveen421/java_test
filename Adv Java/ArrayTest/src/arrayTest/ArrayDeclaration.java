package arrayTest;

public class ArrayDeclaration {
	int x=10;
	int y=20;
	public static void main(String[] args) {
		/*int[] i= {10,20,30,40,50};
		System.out.println(i[0]);
        ArrayDeclaration a=new ArrayDeclaration();
        ArrayDeclaration b[]= {new ArrayDeclaration(),new ArrayDeclaration(),new ArrayDeclaration()};
        System.out.println(b[0].x+"..."+b[0].y);
        System.out.println(b[1]);
        System.out.println(b[2]);
        
        int[] j= new int[(int)200.6];
        Double[] k=new Double['a'];
        System.out.println(j.length);
        System.out.println(j.toString());
        System.out.println(j.getClass());
        //System.out.println(k.getClass());
        System.out.println(k.length);*/
        /*Object obj=new int[] {1,2,3};
        int[] j=(int[])obj;
        for(int i:j) {
        	System.out.println(i+"");
        }*/
		Object obj[]=new ArrayDeclaration[4];
		//obj[0]=new ArrayDeclaration[7];
		System.out.println(obj.length);
		
		ArrayDeclaration []a=new ArrayDeclaration[5];
		a[0]=new ArrayDeclaration();

	}

}
