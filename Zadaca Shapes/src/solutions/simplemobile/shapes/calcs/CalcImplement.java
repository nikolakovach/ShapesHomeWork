package solutions.simplemobile.shapes.calcs;

import java.util.List;

import solutions.simplemobile.shapeModel.Circle;
import solutions.simplemobile.shapeModel.Square;
import solutions.simplemobile.shapeModel.Triangle;



public class CalcImplement implements Calculations{

	double area=0;
	double a,b,h,r;
	
	@Override
	public Double triangleArea(List<Triangle> list) {
		
		for (int i = 0; i < list.size(); i++) {
			a=list.get(i).getBase();
			h=list.get(i).getHeight();
			double tempArea = (a*h)/2;
			area+=tempArea;
		}
		return area;
	}

	@Override
	public Double squareArea(List<Square> list) {
		
		for (Square square : list) {
			b = square.getWidth();
			a = square.getLenght();
			double tempArea = a*b;
			area += tempArea;
		}
		
		return area;
	}

	@Override
	public Double circleArea(List<Circle> list) {
		for (Circle circle : list) {
			r = circle.getRadius();
			double tempArea = Math.PI*Math.pow(r, 2);
			area += tempArea;
		}
		return area;
	}

	
	
}
