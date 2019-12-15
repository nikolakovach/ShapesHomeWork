package solutions.simplemobile.shapeModel;

import java.util.List;

import solutions.simplemobile.shapes.dao.implementation.SquareDAOImpl;

public class Square implements Shape {
	
	private double width;
	private double lenght;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	public Square(double width, double lenght) {
		super();
		this.width = width;
		this.lenght = lenght;
	}
	public Square() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculateArea() {
		List<Shape> list =  new SquareDAOImpl().getShapes();
		double a, b, area;
		area=0;
		for (Shape shape :  list) {
			Square square = (Square) shape;
			b = square.getWidth();
			a = square.getLenght();
			double tempArea = a*b;
			area += tempArea;
		}
		
		return area;
	}
	
	

}
