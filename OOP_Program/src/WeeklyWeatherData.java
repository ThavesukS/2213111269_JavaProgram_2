
public class WeeklyWeatherData {
	
	static int NUMDAYS = 7;
	private double[] rainFall = new double[NUMDAYS];
	private double[] avgPressure = new double[NUMDAYS];
	private double avgRain;
	private double maxRain;
	
	public void setData(double[] rain,double[] pressure) {
		rainFall = rain;
		avgPressure = pressure;
	}
	
	public void calculateStatus() {
		
		maxRain=0;
		double rainsum=0.0;
		
		for(int i=0;i<rainFall.length;i++) {
			if(rainFall[i]>=maxRain) {
				maxRain=rainFall[i];
			}
			
			rainsum+=rainFall[i];
		}
		
		avgRain=rainsum/NUMDAYS;
		
	}
	
	
	public double getAvgRain() {
		return avgRain;
	}
	
	
	public double getMaxRain() {
		return maxRain;
	}
	

}
