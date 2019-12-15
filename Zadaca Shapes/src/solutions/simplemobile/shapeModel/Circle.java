package solutions.simplemobile.shapeModel;

import java.util.List;

import solutions.simplemobile.shapes.dao.implementation.CircleDAOImpl;

public class Circle implements Shape{
	
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		this.radius = r;
	}

	public Circle(double r) {
		super();
		this.radius = r;
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateArea() {
		double r;
		double area =0;
		List<Shape> list = new CircleDAOImpl().getShapes();
		for (Shape shape : list) {
			Circle circle = (Circle) shape;
			r = circle.getRadius();
			double tempArea = Math.PI*Math.pow(r, 2);
			area += tempArea;
		}
		return area;
	}

	


}
