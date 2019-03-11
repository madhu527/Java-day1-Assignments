
import java.util.Scanner;

public class Simple {
	public static void main(String[] args) {

		double p, t, r;

		System.out.println("enter the value of principal ");
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt();
		System.out.println("enter the value of time");

		t = sc.nextInt();
		System.out.println("enter the value of interest");

		r = sc.nextInt();

		double si = p * t * r / 100;
		double ci =(int)( p *( Math.pow((1 + r/100), t)) - p);
		
		{
			System.out.println(si);
			System.out.println(ci);
			sc.close();

		}

	}
}
