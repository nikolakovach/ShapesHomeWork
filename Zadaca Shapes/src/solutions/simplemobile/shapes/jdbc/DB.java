package solutions.simplemobile.shapes.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB implements AutoCloseable {
	private Connection conn;

	public Connection getConn() {
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/shapes", "postgres","admin")) {

			if (connection != null) {
				System.out.println("Connection Succsess");
			}

		} catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
			return null;
		}
		return conn;
	}

	@Override
	public void close() throws SQLException {
		// here close db connection, to be used into TRW block
		// without finally
		this.conn.close();
	}

}
