package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double area(double width, double height) {
		return width * height;
	}
	
	public double perimeter(double width, double height) {
		return 2 * (width + height);
	}
	
	public double diagonal(double widht, double height) {
		double calculo = Math.sqrt(Math.pow(widht,2) + Math.pow(height,2));
		return calculo;
	}
	
}
