package core;

	class Example24{
	    
	    int x =m1();
	    int m1(){
	        System.out.println("Example NSV ");
	        return 10;
	    }
	    
	    {
	        System.out.println("Example NSB");
	    }
	    
	    Example24(){
	    	System.out.println("Example NPC");
	    }
	    
	    void m2() {
	    	System.out.println("Example NSM");
	    } 
	     
	}
	public class Sample24 extends Example24 {
		 int y =m3();
		    int m3(){
		        System.out.println("Sample NSV ");
		        return 20;
		    }	
		    {
		    	System.out.println("third NSB");
		    }
		    Sample24(){
		    	//this("abc");
		    	System.out.println("Sample NPC");
		    }
		    /*Sample24(String st){
		    	
		    	System.out.println("String arg constructor");
		    }*/
		    {
		        System.out.println("Sample NSB");
		    }
		    {
		    	System.out.println("second NSB");
		    }
		    
		    void m4() {
		    	System.out.println("Sample NSM");
		    } 
		   
		    public static void main(String[] args) {
		    	Sample24 s1=new Sample24();
		    }
}
