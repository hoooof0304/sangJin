package java_181109;

public class Calculator2 {

	double width;
	double height;

	public double square(double width) {
		this.width = width;
		double quadA = width * width;
		return quadA;
	}

	public double square1(double width, double height) {
		this.width = width;
		this.height = height;
		double quadA1 = width * height;
		return quadA1;
	}

}
