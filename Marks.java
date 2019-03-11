//Supply marks of three subject and declare the result, result declaration is based on  below conditions:
//Condition 1: -All subjects marks is greater than 60 is Passed 
//Condition 2: -Any two subjects marks are greater than 60 is Promoted
//Condition 3: -Any one subject mark is greater than 60 or all subjects’ marks less than 60 is failed.
import java.util.Scanner;

public class Marks
{
	public static void main(String []args)
	{
		int s1,s2,s3;
		System.out.println("enter the marks of s1");
		Scanner sc1=new Scanner(System.in);
		s1=sc1.nextInt();
		System.out.println("enter the marks of s2");
		Scanner sc2=new Scanner(System.in);
		s2=sc2.nextInt();
		System.out.println("enter the marks of s3");
		Scanner sc3=new Scanner(System.in);
		s3=sc3.nextInt();
		{
			if(s1>60&&s2>60&& s3>60)
				System.out.println("passed");
			else if((s1>60&&s2>60&& s3<60 ) || (s1>60&&s2<60&& s3>60) ||(s1<60&&s2>60&& s3>60 ))
				System.out.println("promoted");
			else if(s1>60 || s2>60 || s3>60)
				System.out.println("failed");
		}
	}

}