
public class Barista {
	
	private String name;
	private char gender;
	
	public Barista(String name,char gender) {
		this.name=name;
		this.gender=gender;
	}
	
	public Barista() {
		name=" ";
		gender=' ';
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
			if(gender == 'm' || gender == 'M') {
				return "Male";
			}else if(gender == 'f' || gender == 'F') {
				return "Female";
			}else {
				return " ";
			}
		}
	}
