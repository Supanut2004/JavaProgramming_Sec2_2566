import java.util.*;
public class Lab701 {

	public static void main(String[] args) {
		int[] nums = new int[7];
		Scanner scan = new Scanner(System.in);
		int count = 1;
		int getnum;
		int countOdd = 0;
		for(int i = 0;i<nums.length;i++) {
			System.out.print("Input number "+count+": ");
			count++;
			getnum = scan.nextInt();
			if(!(getnum % 2 == 0)) {
				countOdd++;
			}
		}
		System.out.println("");
		System.out.println("There is "+ countOdd+" of odd number.");
		System.out.println("List of odd number ");
		for(int num:nums) {
			if((num % 2) != 0) {
				System.out.print(num+" ");
			}
		}
		
	}

}
