 
public class Armstrong { 
	public static void main(String []args) {
    
    		int a=153,s=0,b;
    		b=a;
    		while(a!=0)
    		{
    			int v=a%10;
    			s=s+v*v*v;
    			a=a/10;
    			
    		}
    	if(s==b)
    
    	 System.out.println("it is an Armstrong number.");
         else
             System.out.println("it is not an Armstrong number.");
     
    	}
    	}
 	