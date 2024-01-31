import java.time.Year;

public class FictionBook implements Author, Book {
	
	private String author_name;
	private String email;
	private String title;
	private int publishYear;
	
	
	FictionBook(String title,int publishYear){
		this.title=title;
		this.publishYear=publishYear;
		this.author_name=null;
		this.email=null;
	}
	
	public String getFirstName(){
		int result = author_name.indexOf(' ');
		return this.author_name.substring(0,result).toUpperCase();
	}
	
	public String getLastName(){
		int result = author_name.indexOf(' ');
		return this.author_name.substring(result+1).toUpperCase();
	}
	
	public boolean checkEmail() {
		if(email.endsWith("windowslive.com")||email.endsWith("hotmail.com")) {
			return true;
		}
		else return false;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int totalPublishyear() {
		return Year.now().getValue()-publishYear;
	}
	
	public void setAuthorName(String name) {
		author_name=name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public boolean checkFormatName() {
		if(author_name.indexOf(" ")!=-1) {
			return true;		
		}
		else return false;
	}
	
	public String toString() {
		return title+" write by "+getLastName().charAt(0)+"."+getFirstName()+"("+this.email+")"+"Publish for "+
				totalPublishyear()+" years.";
	}

	

	

}
