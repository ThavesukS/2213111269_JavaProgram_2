
public class Theater extends Movie {
	
	private int theaterNO;
	
	public Theater(String id , String name ,Director director, int theaterNO) {
		super(id,name,director);
		this.theaterNO=theaterNO;
	}
	
	public Theater(){
		super();
		theaterNO=0;
	}
	
	public String getTheaterName() {
		if(theaterNO>=1&&theaterNO<=11) {
			return "Basic Theater";
		}else if(theaterNO>=12&&theaterNO<=14) {
			return "Sweet Theater";
		}else if(theaterNO==15) {
			return "Premium Theater";
		}else {
			return null;
		}
		
	}
	
	public String toString() {
		return getTheaterName()+" : "+super.toString();
	}

}
