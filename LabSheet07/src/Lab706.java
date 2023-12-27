import javax.swing.JOptionPane;

public class Lab706 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		
		int indexNumber = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
		
		
		while(checkIndex(nums,indexNumber)) {
			indexNumber = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again: "));
			
		}
		int currentValue = currentData(nums,indexNumber);
		int prevVal = prevData(nums,indexNumber);
		int nexval  = nextData(nums,indexNumber);
		JOptionPane.showMessageDialog(null, "Current data, nums["+indexNumber+"] is "+ currentValue+""
				+ "\n"+((indexNumber-1<0)?"No Previous data":"Previous data, nums["+(indexNumber-1)+"] is "+ prevVal)+""
						+ "\n"+((indexNumber+1>=nums.length)?"No Next data":"Next data, nums["+(indexNumber+1)+"] is "+ nexval));
	}//end o main()
	
	public static boolean checkIndex(int[] newnum, int indNum) {
		/*if((indNum>=newnum.length)||(indNum<0)) {
			return true;
		}
		else	return false; */
		return ((indNum>=newnum.length)||(indNum<0))?true:false;
	}
	
	public static int currentData(int[] neunum, int innum) {
		return neunum[innum];
	}
	public static int prevData(int[] prevnum, int previnnum) {
		return previnnum-1;
	}
	public static int nextData(int[] nexnum, int nexinnum) {
		return nexinnum+1;
	}

}
