import java.util.Scanner;

public class Validemail{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		System.out.println(email);
		if(email.contains("com") || email.contains("in") || email.contains("net") || email.contains("org")){
			System.out.println("Valid email address");
			
		}
		else
		{
			System.out.println("Invalid email address");
		}
	}

}
