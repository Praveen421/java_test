package core;
class Addition{
	int x; 
	int y;
	Addition(int x,int y){
		this.x=x;
		this.y=y;
	}
	Addition(Integer i1,Integer i2){	    
		//this.x=i1.intValue();
		//this.y=i2.intValue();
		//new Addition(i1.intValue(),i2.intValue()); //wrong value
		this(i1.intValue(),i2.intValue()); //constructor chaining
	}
	Addition(String s1,String s2){	    
		//this.x=Integer.parseInt(s1);
		//this.y=Integer.parseInt(s2);
		//new Addition(Integer.parseInt(s1),Integer.parseInt(s2));  //wrong value
	}
	void add(){
		System.out.println("x: "+x+"\t"+"y: "+y+"\t"+(x+y));
	}
}
public class clac {
	public static void main(String[] args) {
		Addition a1=new Addition(5,6);
		Addition a2=new Addition(new Integer(7),new Integer(8));
		Addition a3=new Addition("9","10");
		//a1.add();
		a2.add();
		//a3.add();
	}
}
