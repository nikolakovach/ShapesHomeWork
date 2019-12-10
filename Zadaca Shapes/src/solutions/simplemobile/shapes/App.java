package solutions.simplemobile.shapes;



import java.util.List;

import solutions.simplemobile.shapeModel.Circle;
import solutions.simplemobile.shapeModel.Square;
import solutions.simplemobile.shapeModel.Triangle;
import solutions.simplemobile.shapes.calcs.CalcImplement;
import solutions.simplemobile.shapes.jdbc.QueryImplements;
import solutions.simplemobile.shapes.jdbc.QueryInterface;

public class App {

	public static void main(String[] args) {
		
		
		insertObjects();
		
		
		calculate();
		
		
	}

	private static void calculate() {
		QueryInterface q = new QueryImplements();
		
		List<Circle> circles = q.getCircles();
		List<Square> squares = q.getSquares();
		List<Triangle> triangles = q.getTriangles();
		
		CalcImplement calc = new CalcImplement();
		double c = calc.circleArea(circles);
		double t = calc.triangleArea(triangles);
		double s = calc.squareArea(squares);
		double sum = c+t+s;
		System.out.println("circles area = "+ c);
		System.out.println("triangles area = "+ t);
		System.out.println("square area = " + s);
		System.out.println("sum of shapes area = " +sum);
	}

	private static void insertObjects() {
		Square square = new Square(2.44, 3.58);
		Square square1 = new Square(5.1, 5.1);
		Square square2 = new Square(2.20, 2.30);
		Triangle triangle = new Triangle(2.0, 3.2);
		Triangle triangle1 = new Triangle(4.6, 8.2);
		Triangle triangle2 = new Triangle(4.0, 8.2);
		
		QueryInterface q = new QueryImplements();
		q.insertCircle("radius", new Circle(27.55).getRadius());
		q.insertCircle("radius", new Circle(15.12).getRadius());
		q.insertCircle("radius", new Circle(2.45).getRadius());
		q.insertSquare("width", "lenght", square.getWidth(), square.getLenght() );
		q.insertSquare("width", "lenght", square1.getWidth(), square1.getLenght());
		q.insertSquare("width", "lenght", square2.getWidth(), square2.getLenght());
		q.insertTriangle("base", "height", triangle.getBase(), triangle.getHeight());
		q.insertTriangle("base", "height", triangle1.getBase(), triangle1.getHeight());
		q.insertTriangle("base", "height", triangle2.getBase(), triangle2.getHeight());
	}



}
