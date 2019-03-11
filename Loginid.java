import java.util.Scanner;

//6)	Consider a CUI based application, where you are asking a user to enter his 
//Login name and password, after entering the valid user-id and password it will 
//print the message “Welcome” along with user name. As per the validation is concerned,
//the program should keep a track of login attempts. After three attempts a message
//should be flashed saying “Contact Admin” and the program should terminate. 

public class Loginid
{
	public static void main(String []args)
	{
		String user_name;
		String password;
		String u_id="madhu";
		String pass="kiran";
		Scanner scanner=new Scanner(System.in);
		{
			System.out.println("enter user_name");
			
			user_name=scanner.nextLine();
			System.out.println("enter password");
			password=scanner.nextLine();
			if(user_name.equals(u_id) && password.equals(pass))
				System.out.println("welcome");
			else
				System.out.println("contact admin");
			
				
				
		}
	}
}