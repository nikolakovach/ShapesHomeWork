package solutions.simplemobile.shapes.calcs;

import java.util.List;

import solutions.simplemobile.shapeModel.Circle;
import solutions.simplemobile.shapeModel.Square;
import solutions.simplemobile.shapeModel.Triangle;



public interface Calculations {
	
	public Double triangleArea(List<Triangle> list);
	public Double squareArea(List<Square> list);
	public Double circleArea(List<Circle> list);
}
