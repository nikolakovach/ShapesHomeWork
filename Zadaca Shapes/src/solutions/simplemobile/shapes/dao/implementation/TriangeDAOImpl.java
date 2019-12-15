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

	private DB database;

	@Override
	public List<Shape> getShapes() {
		database = new DB();
		String query = "select * from triangle";
		PreparedStatement ps;
		ResultSet rs;
		List<Shape> list = new ArrayList<>();
		try {
			ps = database.getConn().prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				Triangle t = new Triangle(rs.getDouble("base"), rs.getDouble("height"));
				list.add(t);
			}
			database.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

}
