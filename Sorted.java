import java.util.Scanner;

//	There is an Array which is of the size 15, which may or may not be sorted. You should 
//write a program to accept a number and search if it in contained in the array
//Example: 
//5	12	14	6	78	19	1	23	26	35	37	7	52	86	47
//Value to be search is 19//

public class Sorted
{
public static void main(String [] args)
{
	int i;
	int[] array=new int[15];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 15 values");
	for(i=0;i<15;i++)
	{
		array[i]=sc.nextInt();
	}
	System.out.println("enter value to search");
	int number=sc.nextInt();
	
	for(i=0;i<15;i++)
	{
		if(number==array[i])
			System.out.println("element found at"+i);
	}
	
	sc.close();
}

}

