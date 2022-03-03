package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconexao {
	private static final String username = "root";
	private static final String password = "root";

	private static final String Database_url = "jdbc:mysql://localhost:3306/agenda";
	static Connection connection = null;

	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(Database_url, username, password);
		} catch (Exception s) {
			throw new Dbexception(s.getMessage());
		}
		return connection;
	}

	public static void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException s) {
				throw new Dbexception(s.getMessage());
			}

		}
	}
}
