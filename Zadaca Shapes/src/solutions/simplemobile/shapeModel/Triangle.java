package solutions.simplemobile.shapeModel;

import java.util.List;

import solutions.simplemobile.shapes.dao.implementation.TriangeDAOImpl;

public class Triangle implements Shape{

	private double base;
	private double height;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	
	
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculateArea() {
		List<Shape> list =  new TriangeDAOImpl().getShapes();
		double a, h, area;
		area=0;
		for (int i = 0; i < list.size(); i++) {
			a=((Triangle) list.get(i)).getBase();
			h=((Triangle) list.get(i)).getHeight();
			double tempArea = (a*h)/2;
			area+=tempArea;
		}
		return area;
	}
	
	
}
