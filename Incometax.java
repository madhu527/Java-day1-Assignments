 

//Calculate the income tax on the basis of following table.
//Note:-Assume slab is consider for Male, Female as well as Senior citizen
//Slab	Income Range	Tax payable in Percentage
//Slab A	0-1,80,000	Nil
//Slab B	1,81,001-3,00,000	10%
//Slab C	3,00,001-5,00,000	20%
//Slab D	5,00,001-10,00,000	30%
//Accept CTC from user and display tax amount 
import java.util.Scanner; 
public class Incometax {
	public static void main(String []args)
	{
		int s;
		System.out.println("Enter the range of slab s");
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		{
			if(s>0 && s<180000)
				System.out.println("Nill");
			
			else if(s>181001 && s<300000)
				System.out.println("10%");
	
			else if(s>300001 && s<500000)
			System.out.println("20%");
			
			else if(s>500001 && s<1000000)
				System.out.println("30%");
		}
		
		
		 
	}

}
