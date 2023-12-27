
public class Example1 {

	public static void main(String[] args) {
		int[] nums = {12,50,93,45,75,52,80};
		System.out.println("Using FOR for display. Ehe!\n");
		for(int i = 0; i<nums.length;i++) {
			System.out.println("nums["+i+"] ="+nums[i]);
		}
		System.out.println("\nUsing FOREACH\n");
		int j = 0;
		for(int new_num:nums) {
			
			System.out.println("nums["+j+"] ="+new_num);
			j++;
		}
		printArray(nums);
	}//end o main()
	
	public static void printArray(int[] neo_num) {
		System.out.println("\nUsing method to SADAENG Array\n");
		for(int i=0;i<neo_num.length;i++) {
			System.out.println("nums["+i+"] ="+neo_num[i]);
		}
		
	}

}
