package solutions.simplemobile.shapes.jdbc;

import java.util.List;

import solutions.simplemobile.shapeModel.Circle;
import solutions.simplemobile.shapeModel.Square;
import solutions.simplemobile.shapeModel.Triangle;

public interface QueryInterface {
	
	public String insertTriangle(String base, String height, Double a, Double h);
	public String insertCircle(String q, Double a);
	public String insertSquare(String width, String lenght, Double a, Double b);
	public List<Triangle> getTriangles();
	public List<Circle> getCircles();
	public List<Square> getSquares();
}
