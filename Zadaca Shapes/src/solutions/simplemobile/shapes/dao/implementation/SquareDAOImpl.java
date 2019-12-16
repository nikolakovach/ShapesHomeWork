package solutions.simplemobile.shapes.dao.implementation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import solutions.simplemobile.shapeModel.Shape;
import solutions.simplemobile.shapeModel.Square;
import solutions.simplemobile.shapes.dao.SquareDAO;
import solutions.simplemobile.shapes.jdbc.DB;

public class SquareDAOImpl implements SquareDAO {

	
		

		@Override
		public List<Shape> getShapes() {
			
			String query ="select * from square";
			
			List<Shape> list = new ArrayList<>();
			try (DB database = new DB();
					PreparedStatement ps = database.getConn().prepareStatement(query);
					ResultSet rs = ps.executeQuery()){
				
				while (rs.next()) {
					Square s = new Square(rs.getDouble("width"), rs.getDouble("lenght"));
					list.add(s);
				}
				//database.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return list;
		}
	}

