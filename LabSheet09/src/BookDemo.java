import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Book b1 = new Book();
		System.out.print("Input book title		: ");
		String Bname = s1.nextLine();
		System.out.print("Input book price		: ");
		float Bprice = s1.nextFloat();
		System.out.print("Input Publish year		: ");
		int Byear = s1.nextInt();
		
		b1.setTitle(Bname);
		b1.setPrice(Bprice);
		b1.setPublishyear(Byear);
		System.out.println(b1);

	}

}
