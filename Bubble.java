import java.util.Scanner;

public class Bubble {
public static void main(String [] args)
{
	int i;
	int[] array=new int[15];
	Scanner scanner=new Scanner(System.in);
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
	
	scanner.close();
}
}



