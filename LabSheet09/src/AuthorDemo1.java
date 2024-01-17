import java.util.*;
public class AuthorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.print("Input author name	: ");
		String Aname = s1.nextLine();
		System.out.print("Input author e-mail	: ");
		String Amail = s1.nextLine();
		System.out.print("Input auothor gender	: ");
		char Agender = s1.next().charAt(0);
		
		Author a1 = new Author(Aname,Amail,Agender);
		System.out.println(a1);
	}

}
