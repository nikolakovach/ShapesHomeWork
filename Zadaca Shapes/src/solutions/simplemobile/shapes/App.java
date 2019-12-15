package solutions.simplemobile.shapes;


import solutions.simplemobile.shapeModel.Circle;
import solutions.simplemobile.shapeModel.Shape;
import solutions.simplemobile.shapeModel.Square;
import solutions.simplemobile.shapeModel.Triangle;


public class App {

	public static void main(String[] args) {
		
		
		
		Shape triangle = new Triangle();
		Shape circle = new Circle();
		Shape square = new Square();
		
		
		System.out.println("Triangles area: " +triangle.calculateArea());
		System.out.println("Circles area: " +circle.calculateArea());
		System.out.println("Squares area: " +square.calculateArea());
		
		
	}

	


}
