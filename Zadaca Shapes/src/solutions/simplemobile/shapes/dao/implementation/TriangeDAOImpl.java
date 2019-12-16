package solutions.simplemobile.shapes.dao.implementation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import solutions.simplemobile.shapeModel.Shape;
import solutions.simplemobile.shapeModel.Triangle;
import solutions.simplemobile.shapes.dao.TriangleDAO;
import solutions.simplemobile.shapes.jdbc.DB;

public class TriangeDAOImpl implements TriangleDAO {

	

	@Override
	public List<Shape> getShapes() {
		
		String query = "select * from triangle";
		
		List<Shape> list = new ArrayList<>();
		try (DB database = new DB();
				PreparedStatement ps = database.getConn().prepareStatement(query);
				ResultSet rs = ps.executeQuery()){
			

			while (rs.next()) {
				Triangle t = new Triangle(rs.getDouble("base"), rs.getDouble("height"));
				list.add(t);
			}
			//database.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

}
