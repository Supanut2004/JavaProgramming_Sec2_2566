import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String titleInput = scan.nextLine();
		int yearInput = scan.nextInt();
		
		
		FictionBook test1 = new FictionBook(titleInput,yearInput);
		scan.nextLine();
		String authorInput = scan.nextLine();
		test1.setAuthorName(authorInput);
		while(!test1.checkFormatName()) {
			System.out.print("Again: ");
			authorInput = scan.nextLine();
			test1.setAuthorName(authorInput);
		}
		String emailInput = scan.nextLine();
		test1.setEmail(emailInput);
		while(!test1.checkEmail()) {
			System.out.print("Again: ");
			emailInput = scan.nextLine();
			test1.setEmail(emailInput);
		}
		System.out.println(test1);
		
		

	}

}
