package entities;

public class Rectangle {

	public double widht;
	public double height;
	
	public double area () {
		return height * widht; 
	}
	public double perimetro () {
		return 2 * (widht + height);
	}
	public double diagonal () {
		return Math.sqrt(widht * widht + height * height);
	}
	
}

