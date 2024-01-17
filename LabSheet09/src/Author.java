
public class Author {
	public static final String DEFAULT_NAME = "";
	public static final String DEFAULT_EMAIL = "";
	public static final char DEFAULT_gender = ' ';
	
	private String name;
	private String email;
	private char gender;
	
	Author(String name,String email,char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	Author(String name ,String email){
		this.name = name;
		this.email = email;
		this.gender = DEFAULT_gender;
	}
	Author(){
		this.name = DEFAULT_NAME;
		this.email = DEFAULT_EMAIL;
		this.gender = DEFAULT_gender;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
		if(gender == 'M'||gender == 'm') {
			return "Male";	
		}
		else if(gender == 'F'||gender =='f'){
			return "Female";
		}
		else {
			return "Null";
		}
	}
	public String toString() {
		return "Author name : "+name+"("+email+";"+getGenderName()+")";

	}

}
