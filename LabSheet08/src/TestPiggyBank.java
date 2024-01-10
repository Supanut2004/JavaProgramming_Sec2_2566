import java.util.*;
public class TestPiggyBank {
	static PiggyBank pb = new PiggyBank();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/*PiggyBank pb = new PiggyBank();
		pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);*/
		inputCoin();
	}
	public static void inputCoin() {
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("Please define size of PiggyBank : ");
		int sizeofPiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("Size of your PiggyBank : "+pb.getPiggyBank());
		mainMenu();
	}
	
	public static void mainMenu() {
		while (true){
			System.out.println("=====================");
			System.out.println("Menu of PiggyBank");
			System.out.println("=====================");
			System.out.println("[1] one baht."+"\n[2] two baht."+"\n[3] five baht."+"\n[4] ten baht."+"\n[5] exit");
			System.out.println("=====================");
			System.out.print("Please Select Menu[1-5] : ");
			int Menu = scan.nextInt();
			if(Menu==1) {
				System.out.print("Insert 1 Baht Money: ");
				int oneBaht = scan.nextInt();
				pb.addOne(oneBaht);
				System.out.println("Money Total : "+pb.getTotal());
				System.out.println();
			}
			else if(Menu==2) {
				System.out.print("Insert 2 Baht Money: ");
				int twoBaht = scan.nextInt();
				pb.addTwo(twoBaht);
				System.out.println("Money Total : "+pb.getTotal());
				System.out.println();
			}
			else if (Menu==3) {
				System.out.print("Insert 5 Baht Money: ");
				int fiveBaht = scan.nextInt();
				pb.addFive(fiveBaht);
				System.out.println("Money Total : "+pb.getTotal());
				System.out.println();
			}
			else if(Menu==4) {
				System.out.print("Insert 10 Baht Money: ");
				int tenBaht = scan.nextInt();
				pb.addTen(tenBaht);
				System.out.println("Money Total : "+pb.getTotal());
				System.out.println();
			}
			else if(Menu==5) {
				System.out.print("Bye Bye");
				break;
			}
			
		}
	}
}
