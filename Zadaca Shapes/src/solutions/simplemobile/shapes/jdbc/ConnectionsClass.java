package solutions.simplemobile.shapes.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import solutions.simplemobile.shapeModel.Circle;
import solutions.simplemobile.shapeModel.Square;
import solutions.simplemobile.shapeModel.Triangle;

public class ConnectionsClass {
	
	public String connect(String query) {
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/shapes", "postgres", "admin")) {
			
            
            if(connection!=null) {
            	System.out.println("Connection Succsess");
            	Statement stmt=connection.createStatement();
	            stmt.executeUpdate(query);
            }
            
 
        }catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
            return "error";
        }
		return "ok";
	}
	
	public List<?> getFromDb(String query, String type){
		List<Object> list = new ArrayList<>();
		
		try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/shapes", "postgres", "admin")){
			
			System.out.println("Connected to database");
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			switch (type) {
			case "T":
				while(rs.next()) {
					Triangle t = new Triangle(rs.getDouble("base"), rs.getDouble("height"));
				list.add(t);
					//System.out.println(rs.getDouble("base") +", " +rs.getDouble("height"));
					}
				break;

			case "S":
				while(rs.next()) {
					Square square = new Square(rs.getDouble("width"), rs.getDouble("lenght"));
				list.add(square);
				}
				break;
				
			case "C":
				while(rs.next()) {
					Circle c = new Circle(rs.getDouble("radius"));
				list.add(c);
				}
				break;
			}
			
			
			
			
			
		}catch(SQLException  e) {
			System.out.println(e.toString());
			return null;
		}
		
		return list;
	}

}
