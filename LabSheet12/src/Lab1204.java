import java.io.*;
import java.util.*;
public class Lab1204 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rating of books: ");
		double inputRating = input.nextDouble();
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tmp = "";
		int countBook = 0, numBook=1;
		while((tmp = readFile.readLine())!=null) {
			String[] data = tmp.split("\t");
			
			String titleBook = data[0];
			String nameAuthor = data[1];
			double rating = Double.parseDouble(data[2]);
			int peopleRating = Integer.parseInt(data[3]);
			
			if(rating >= inputRating) {
				System.out.println("Book"+" "+numBook+" : "+titleBook+" write by "+nameAuthor+" ("+peopleRating+") reviews");
				countBook++;
			}
			numBook++;
		}
		readFile.close();
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("There are "+countBook+" book get rating more than "+inputRating);
		
	}
 
}