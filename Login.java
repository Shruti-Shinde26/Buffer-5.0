package Buffer;

import java.io.IOException;
import java.util.*;


public class Login {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		String username,newusername,password,newpassword;

		int choose,i;
		ArrayList<String>usernamelist=new ArrayList<>();
		ArrayList<String>passwordlist=new ArrayList<>();

		do {

		System.out.println("1-REGISTER\n2-LOGIN\n3-EXIT");
		choose=sc.nextInt();

		switch(choose)

		{

		case 1:

			System.out.println("Enter the username:");

			username=sc.next();
			usernamelist.add(username);
			System.out.println("Enter the password:");
			password=sc.next();
			passwordlist.add(password);
			System.out.println("YOU HAVE REGISTERED SUCCESSFULLY!");
			break;

			case 2:

			System.out.println("Enter the username:");

			newusername=sc.next();

			

			System.out.println("Enter the password:");

			newpassword=sc.next();

			int c=0;

			int n = usernamelist.size();

			for(i=0;i<n;i++)

			{
				String u = usernamelist.get(i);

				String p=passwordlist.get(i);
				if(u.equals(newusername)&&p.equals(newpassword))

				{
					c++;
					System.out.println("LOGIN SUCCESSFUL!");
					Representation work = new Representation();
					work.main(args);
				}

			}

			if(c==0)System.out.println("INCORRECT USERNAME OR PASSWORD!");
			break;

		case 3:

			System.out.println("EXITING...");
			break;
			default:
				System.out.println("INVALID INPUT!");
				break;
		}

		}while(choose!=3);

		sc.close();
		}
}