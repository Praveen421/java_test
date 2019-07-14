package chapter27;
public class FinallyTest {

	public static void main(String[] args) {
		//case====01
		
		try {
			
			System.out.println("in try");
			
		}catch(ArithmeticException ae) {
			
			System.out.println("in catch");
			
		}finally {
			System.out.println("in finally");
		}
		System.out.println("after try/catch/finally");
		
		//case====02
		
        /*try {
			
			System.out.println("in try");
			System.out.println(10/0);
			
		}catch(ArithmeticException ae) {
			
			System.out.println("in catch");
			
		}finally {
			System.out.println("in finally");
		}
		System.out.println("after try/catch/finally");*/
		
		//case====03
		
        /*try {
			
			System.out.println("in try");
			System.out.println(10/0);
			
		}catch(NullPointerException  ae) {
			
			System.out.println("in catch"); 
			
		}finally {
			System.out.println("in finally");
		}
		System.out.println("after try/catch/finally");*/
		
		//case====04
		
        /*try {
			
			System.out.println("in try");
					
		
			
		}finally {
			System.out.println("in finally");
		}
		System.out.println("after try/finally");*/
		
		//case====05
		
        /*try {
			
			System.out.println("in try");
			System.out.println(10/0);
			
		}
			
		finally {
			System.out.println("in finally");
		}
		System.out.println("after try/finally");*/
		
		//case====06
		
       /*for(int i=0;i<=10;i++) {
    	   System.out.println("in loop : "+i);
    	   try {
    		   
    		   System.out.println("in try");
    		   if(i==5) {
    			   break;
    		   }
    	   }
    	   finally {
    		   System.out.println("in finally");
    	   }
    	   System.out.println("after try/finaly");
       }
       System.out.println("after loop");*/
		
		//case====07
		
		/*for(int i=0;i<=10;i++) {
	    	   System.out.println("in loop : "+i);
	    	   try {
	    		   
	    		   System.out.println("in try");
	    		   if(i==5) {
	    			   continue;
	    		   }
	    	   }
	    	   finally {
	    		   System.out.println("in finally");
	    	   }
	    	   System.out.println("after try/finaly");
	       }
	       System.out.println("after loop");*/
		
		//case====08
		
		/*try {
			System.out.println("in try");
			return;
		}
		finally {
			System.out.println("in finally");
		}
		//System.out.println("after try/finally");*/
		
		//case====09
		
	/*	System.out.println(m1());
	}

	public static int m1() {
		try {
			System.out.println("in try");
			return 10;
		}
		finally {
			System.out.println("in finally");
		}
		System.out.println("after try/finally");
		return 20;*/
		
		//case====10
		
		/*for(int i=0;i<=10;i++) {
	    	   System.out.println("in loop : "+i);
	    	   try {
	    		   
	    		   System.out.println("in try");
	    		   if(i==5) {
	    			   return;  
	    		   }
	    	   }
	    	   finally {
	    		   System.out.println("in finally");
	    	   }
	    	   System.out.println("after try/finaly");
	       }
	       System.out.println("after loop");*/
	}
}
