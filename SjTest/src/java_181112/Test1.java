package java_181112;

public class Test1 {
	private double distance = 0.0;
	private int absolute = 0;

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getAbsolute() {
		return absolute;
	}

	public void setAbsolute(int absolute) {
		this.absolute = absolute;
	}

	public double distance(double x, double x1, double y, double y1) {
		distance = Math.sqrt((Math.pow(x-x1, 2))+((Math.pow(y-y1, 2))));
		return distance;
	}
	
	public int absolute(int a) {
		if (a >= 0) {
			return absolute;	
		}else {
			return -absolute;
		}
		
		
	}

}
