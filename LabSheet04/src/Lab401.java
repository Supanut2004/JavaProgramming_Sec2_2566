import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			System.out.print("Input value of X : ");
		int x = scan.nextInt();
			System.out.print("Input value of Y : ");
		int y = scan.nextInt();
		
			while(x>y){
			System.out.print("Input value of Y, again : ");
			y = scan.nextInt();
			}
		
			System.out.print("\n");
		
			int z =x;
			
			while(x<y){
				int sum = z+x+1;
				System.out.println(""+z+" + "+""+(x+1)+" = "+""+sum);
				z = sum;
				x++;
			}

	}

}
