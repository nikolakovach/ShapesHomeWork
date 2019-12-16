package solutions.simplemobile.shapes.dao.implementation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import solutions.simplemobile.shapeModel.Circle;
import solutions.simplemobile.shapeModel.Shape;
import solutions.simplemobile.shapes.dao.CircleDAO;
import solutions.simplemobile.shapes.jdbc.DB;

public class CircleDAOImpl implements CircleDAO {



	@Override
	public List<Shape> getShapes() {
		
		String query ="select * from circle";
		
		List<Shape> list = new ArrayList<>();
		try ( DB database = new DB(); 
				PreparedStatement ps = database.getConn().prepareStatement(query);
				ResultSet rs = ps.executeQuery()){
			
			
			while (rs.next()) {
				Circle c = new Circle(rs.getDouble("radius"));
				list.add(c);
			}
			//database.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
