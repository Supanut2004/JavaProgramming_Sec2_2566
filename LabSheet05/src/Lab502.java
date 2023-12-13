import java.util.*;
public class Lab502 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		int iold = -1;
		while(!sentence.endsWith(".")) {
		    	System.out.print("The sentence must end with full stop point : ");
		    	sentence = scan.nextLine();
		    	
		    }
		    for(int i = 0;i<sentence.length()-1;i++) {
		    	if(sentence.charAt(i)==' '){
		    		System.out.println(sentence.substring((iold+1),i));
		    		iold=i;;
		    	}
		    	
		    }
		    System.out.println(sentence.substring(iold+1));
	}
}
