
public class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;

	}

	public Author(String name, String email) {
		this.name = name;
		this.email = email;
		this.gender = ' ';

	}

	public Author() {
		this.name = "";
		this.email = "";
		this.gender = ' ';

	}
	
	public String getName(String name) {
		return this.name;
	}
	
	public String getEmail(String email) {
		return this.email;
	}
	public String getGenderName() {
		if(this.gender=='m'||gender=='M') {
			return "Male";
		}else if(this.gender=='f'||this.gender=='F') {
			return "Female";
		}else {
			return null;
		}
	}
	public String toString() {
		return "Author name: "+this.name+" ("+this.email+";"+getGenderName()+")";
	}

}
