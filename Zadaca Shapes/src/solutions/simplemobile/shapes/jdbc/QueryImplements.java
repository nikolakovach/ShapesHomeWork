package solutions.simplemobile.shapes.jdbc;


import java.util.List;

import solutions.simplemobile.shapeModel.Circle;
import solutions.simplemobile.shapeModel.Square;
import solutions.simplemobile.shapeModel.Triangle;

public class QueryImplements extends ConnectionsClass implements QueryInterface{

	
	@Override
	public String insertTriangle(String base, String height, Double a, Double h) {
		String query = "insert into triangle ("+base+","+ height+") "+ "values ("+"'"+a+"'"+","+"'"+h+"'"+")";
		System.out.println("triangle with base "+ a+" and height "+ h+" inserted into db");
		
		return connect(query);
	}

	@Override
	public String insertCircle(String q, Double a) {
		String query = "INSERT INTO circle "+"("+q+") VALUES ('"+a+"');";
		System.out.println("circle with radius "+ a+" inserted into db");
		
		return connect(query);
	}

	@Override
	public String insertSquare(String width, String lenght, Double a, Double b) {
		String query = "INSERT INTO square "+"("+width+","+lenght+") VALUES ("+"'"+a+"'"+","+"'"+b+"'"+");";
		System.out.println("square with width "+ a+" and lenght "+ b+" inserted into db");
		
		return connect(query);
	}

	@Override
	public List<Triangle> getTriangles() {
		String query = "select * from triangle";
		//connect(query);
		List<Triangle> fromDb = (List<Triangle>) getFromDb(query, "T");
		return fromDb;
	}

	@Override
	public List<Circle> getCircles() {
		String query = "select * from circle";
		List<Circle> fromDb = (List<Circle>) getFromDb(query, "C");
		return fromDb;
	}

	@Override
	public List<Square> getSquares() {
		String query = "select * from square";
		List<Square> fromDb = (List<Square>) getFromDb(query, "S");
		return fromDb;
	}

}
