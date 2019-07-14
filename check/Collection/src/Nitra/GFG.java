package Nitra;
public class GFG {
	 static boolean isInterleaved (String A, String B, String C)  
	    { 
	        int i = 0, j = 0, k = 0;	       
	        while (k != C.length() - 1)  
	        {  	            
	            if (A.charAt(i) == C.charAt(k))  
	                i++;  	           
	            else if (B.charAt(j) == C.charAt(k))  
	                j++; 	           
	            else
	                return false;              
	            k++;  
	        }          
	        if (i < A.length() || j < B.length())  
	            return false;       
	        return true;  
	    }  
	public static void main(String[] args) {		
		String A = "WX";  
        String B = "YZ";  
        String C = "WXYZ";  
        if (isInterleaved(A, B, C) == true)  
            System.out.printf("%s is interleaved of %s and %s", C, A, B);  
        else
            System.out.printf("%s is not interleaved of %s and %s", C, A, B); 
    
	}
}
